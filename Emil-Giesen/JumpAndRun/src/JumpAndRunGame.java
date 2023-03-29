import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JumpAndRunGame extends JPanel implements KeyListener, Runnable {

    private static final long serialVersionUID = 1L;
    private JFrame window;
    private Thread thread;
    private Player player;
    private Obstacle obstacle;
    private boolean gameRunning;
    private int score;

    public JumpAndRunGame() {
        window = new JFrame("Jump and Run Game");
        window.setSize(800, 600);
        window.addKeyListener(this);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.add(this);
        window.setVisible(true);
        player = new Player();
        obstacle = new Obstacle();
        gameRunning = true;
        score = 0;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            player.jump();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        player.draw(g);
        obstacle.draw(g);
        g.setColor(Color.BLACK);
        g.drawString("Score: " + score, 20, 20);
    }

    public void run() {
        while (gameRunning) {
            player.update();
            obstacle.update();
            if (obstacle.collidesWith(player)) {
                gameRunning = false;
            }
            if (obstacle.isPassed(player)) {
                score++;
            }
            repaint();
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new JumpAndRunGame();
    }
}
