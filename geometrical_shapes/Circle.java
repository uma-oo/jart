
package geometrical_shapes;

import geometrical_shapes.Point;

public class Circle {

    public int radius;
    public Point center;

    public Circle() {
        this(0, new Point());
    }

    public Circle(int radius, Point point) {
        this.radius = radius;
        center = point;
    }

    public void draw(Displayable displayable) {

        displayable.display();
    }

}
