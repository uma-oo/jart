package geometrical_shapes;


import java.util.*;







public class Point implements Drawable {

    public int x;
    public int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point random() {
        Random random = new Random();

        int x = random.nextInt(1000);
        int y = random.nextInt(1000);

        return new Point(x, y);

    }

    public void  draw( Displayable displayable) {
       
        displayable.display(); 
    }

    public Color getColor() {
        
    }

}