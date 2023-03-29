import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.JPanel;

public abstract class Game extends JPanel implements KeyListener {

    private Player player;
    private List<Obstacle> obstacles;

    public Game() {
    }
}