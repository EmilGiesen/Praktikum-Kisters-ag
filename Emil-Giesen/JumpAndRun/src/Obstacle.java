
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Obstacle {

    private int x;
    private int y;
    private int dx;
    private int size;
    private int gap;
    private Random rand;

    public Obstacle() {
        x = 800;
        size = 30;
        gap = 200;
        rand = new Random();
        reset();
    }

    public void reset() {
        y = rand.nextInt(400 - gap - size) + size;
        dx = -5;
    }

    public void update() {
        x += dx;
        if (x < -size) {
            x = 800;
            reset();
        }
    }

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(x, y, size, size);
        g.fillRect(x, y + gap, size, size);
    }

    public boolean collidesWith(Player player) {
        return player.getBounds().intersects(new Rectangle(x, y, size, size))
                || player.getBounds().intersects(new Rectangle(x, y + gap, size, size));
    }

    public boolean isPassed(Player player) {
        return player.getBounds().intersects(new Rectangle(x + size, y, 1, gap));
    }
}

