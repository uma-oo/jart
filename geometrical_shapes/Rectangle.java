package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Rectangle  implements Drawable{

    public Point p1;
    public Point p2;
    public Color color; 

    public Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.color = getColor(); 
    }

    public void draw(Displayable displayable) {

        // displayable.display();
        Line[] lines = {
                new Line(this.p1, new Point(this.p2.x, this.p1.y)),
                new Line(new Point(this.p2.x, this.p1.y), this.p2),
                new Line(this.p2, new Point(this.p1.x, this.p2.y)),
                new Line(new Point(this.p1.x, this.p2.y), this.p1),
        };

        for (Line line : lines) {
            line.color = this.color;
            line.draw(displayable);
        }
    }



}