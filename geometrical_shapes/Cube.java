package geometrical_shapes;

import java.util.Random;
import java.awt.Color;

public class Cube implements Drawable {
    private Point p;
    private int span;
    private Color color;

    public Cube(Point p, int span) {
        this.p = p;
        this.span = span;
        this.color = getColor();
    }

    public static Cube random(int width, int height) {

        Point p = Point.random(width, height);
        int span = new Random().nextInt(width);

        return new Cube(p, span);
    }

    @Override
    public void draw(Displayable displayable) {
        Line[] lines = {
                new Line(this.p, new Point(this.p.x + span, this.p.y)),
                new Line(new Point(this.p.x + span, this.p.y), new Point(this.p.x + span, this.p.y + span)),
                new Line(new Point(this.p.x + span, this.p.y + span), new Point(this.p.x, this.p.y + span)),
                new Line(new Point(this.p.x , this.p.y + span), this.p),

        };

        for (Line line : lines) {
            line.color = this.color;
            line.draw(displayable);
        }
    }

}
