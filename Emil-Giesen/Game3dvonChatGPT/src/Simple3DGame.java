import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Sphere;

public class Simple3DGame extends SimpleApplication {

    public static void main(String[] args) {
        Simple3DGame app = new Simple3DGame();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        Sphere sphere = new Sphere(32, 32, 1f);
        Geometry ballGeometry = new Geometry("Ball", sphere);
        Material ballMaterial = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        ballMaterial.setTexture("ColorMap", assetManager.loadTexture("Textures/globe.png"));
        ballGeometry.setMaterial(ballMaterial);
        rootNode.attachChild(ballGeometry);
        cam.setLocation(new Vector3f(0, 0, 10f));
    }

    @Override
    public void simpleUpdate(float tpf) {
        rootNode.getChild("Ball").rotate(0, 2*tpf, 0);
    }
}

