import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Player {

    private int x;
    private int y;
    private int dy;
    private int size;

    public Player() {
        x = 100;
        y = 400;
        dy = 0;
        size = 30;
    }

    public void jump() {
        if (y == 400) {
            dy = -15;
        }
    }

    public void update() {
        if (y < 400) {
            dy += 1;
        }
        y += dy;
        if (y > 400) {
            y = 400;
            dy = 0;
        }
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, size, size);
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, size, size);
    }
}

