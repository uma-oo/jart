
package geometrical_shapes;

import geometrical_shapes.Point;

public class Rectangle {

    public Point p1;
    public Point p2;

    public Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void draw(Displayable displayable) {

        displayable.display();
    }

}