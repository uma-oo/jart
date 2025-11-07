
package geometrical_shapes;

import java.awt.Frame;
import java.awt.Image.*;

// void display(int x, int y, Color color);
// void save(String string);

public class Image implements Displayable {

    public int width;
    public int height;

    public Image(int width, int height) {
        try {
            new Frame("Image");
        } catch (Exception e) {
            System.out.println("Error hnaaa");
            return;
        }

        this.width = width;
        this.height = height;

    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void display(int x, int y, Color color) {

    }

    public void save(String path) {

    }
}
