import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;

public class JumpAndRun extends Canvas implements Runnable, KeyListener {

    private static final long serialVersionUID = 1L;
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final String TITLE = "Jump and Run";

    private Thread thread;
    private boolean running = false;

    private Player player;
    private List<Obstacle> obstacles = new ArrayList<Obstacle>();
    private int score = 0;

    public JumpAndRun() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        addKeyListener(this);
        player = new Player(100, HEIGHT - 80, 5, -10, 20);
    }

    public void start() {
        thread = new Thread(this);
        running = true;
        thread.start();
    }

    public void stop() {
        try {
            running = false;
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (running) {
            update();
            render();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        stop();
    }

    private void update() {
        player.update();
        for (Obstacle o : obstacles) {
            o.update();
            if (player.intersects(o)) {
                running = false;
            }
        }
        if (obstacles.size() < 5) {
            obstacles.add(generateObstacle());
        }
        for (int i = 0; i < obstacles.size(); i++) {
            if (obstacles.get(i).getX() < -100) {
                obstacles.remove(i);
                score++;
            }
        }
    }

    private void render() {
        BufferStrategy bs = getBufferStrategy();
        if (bs == null) {
            createBufferStrategy(3);
            return;
        }
        Graphics g = bs.getDrawGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        player.draw(g);
        for (Obstacle o : obstacles) {
            o.draw(g);
        }
        g.setColor(Color.BLACK);
        g.drawString("Score: " + score, 10, 20);
        bs.show();
        g.dispose();
    }

    private Obstacle generateObstacle() {
        Random random = new Random();
        int x = WIDTH + random.nextInt(400);
        int y = HEIGHT - 80 - random.nextInt(80);
        int speed = -5 - random.nextInt(5);
        int width = 20 + random.nextInt(60);
        int height = 20 + random.nextInt(60);
        return new Obstacle(x, y, speed, width, height);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_SPACE) {
            player

