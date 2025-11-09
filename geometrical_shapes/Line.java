package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Line  implements Drawable{

    public Point p1;
    public Point p2;
    public Color color;

    public Line() {
        this(new Point(), new Point());
    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.color = getColor();
    }

    public static Line random(int width, int height) {
        return new Line(Point.random(width, height), Point.random(width, height));
    }

    Point[] getPoints() {
        int dx = this.p2.x - this.p1.x;
        int dy = this.p2.y - this.p1.y;
        int points = Math.max(Math.abs(dx), Math.abs(dy));
        Point[] generatedPoints = new Point[points];
        for (int i = 0; i < points; i++) {
            float t = (float) i / points;
            float x = this.p1.x + (dx * t);
            float y = this.p1.y + (dy * t);
            generatedPoints[i] = new Point(Math.round(x), Math.round(y));

        }
        return generatedPoints;
    }

    public void draw(Displayable displayable) {
        for (Point point : this.getPoints()) {
            point.color = this.color;
            point.draw(displayable);
        }
    }

}
