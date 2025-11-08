package geometrical_shapes;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Image implements Displayable {

    public int width;
    public int height;
    private BufferedImage image;

    public Image(int width, int height) {

        this.image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
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
        if (x >= 0 && y >= 0 && x < this.image.getWidth() && y < this.image.getHeight()) {
            this.image.setRGB(x, y, color.getRGB());
        }

    }

    public void save(String path) {
        try {
            File file = new File(path);
            ImageIO.write(this.image, "png", file); // Save as PNG
            System.out.println("Image saved to: " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
