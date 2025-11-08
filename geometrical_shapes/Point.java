package geometrical_shapes;

import java.util.*;
import java.awt.Color;

public class Point implements Drawable {

    public int x;
    public int y;
    public Color color;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = getColor();
    }

    public static Point random(int width, int height) {
        Random random = new Random();

        int x = random.nextInt(width);
        int y = random.nextInt(height);

        return new Point(x, y);

    }

    public void draw(Displayable displayable) {
        displayable.display(this.x, this.y, this.color);
    }

    public Color getColor() {

        Random random = new Random();
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);

        return new Color(r, g, b);
    }

}