
package geometrical_shapes;

import java.awt.Color;
import java.util.Random;


public class Triangle implements Drawable {

    public Point p1;
    public Point p2;
    public Point p3;
    private Color color ; 

    public Triangle() {
        this(new Point(), new Point(), new Point());
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.color = getColor(); 
    }

    public void draw(Displayable displayable) {

        Line[] lines = {
                new Line(p1, p2),
                new Line(p2, p3),
                new Line(p3, p1),
        };

        for (Line line : lines) {
            line.color = this.color; 
            line.draw(displayable);
        }
    }

}