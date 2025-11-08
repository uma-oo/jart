package geometrical_shapes;

import java.util.Random;
import java.awt.Color;

public class Circle {

    public int radius;
    public Point center;
    private Color color;

    public Circle() {
        this(0, new Point());
    }

    public Circle(int radius, Point point) {
        this.radius = radius;
        center = point;
        this.color = getColor();
    }

    public static Circle random(int width, int height) {
        Random random = new Random();
        int radius = random.nextInt(width);
        Point center = Point.random(width, height);
        return new Circle(radius, center);

    }

    public void draw(Displayable displayable) {
        double perimter = 2 * Math.PI * this.radius;
        double steps = 2 * Math.PI / perimter;
        double i = 0;
        while (i < 2 * Math.PI) {
            int x = (int) (this.center.x + (this.radius * Math.cos(i)));
            int y = (int) (this.center.y + (this.radius * Math.sin(i)));
            i += steps;
            Point newPoint = new Point(x, y);
            newPoint.color = this.color;
            newPoint.draw(displayable);

        }
    }

    public Color getColor() {

        Random random = new Random();
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);

        return new Color(r, g, b);
    }

}

// x = cx + r * cos(θ) and y = cy + r * sin(θ)
// teta will be starting from 0 to 2PI
// impl Drawable for Circle {
// fn draw(&self, image: &mut Image) {
// let perimter = 2.0 * PI * (self.radius as f64);
// let steps = (2.0 * PI) / (perimter as f64);
// let mut i: f64 = 0.0;
// let color = Circle::color();
// while i <=2.0*PI {
// let x = (self.center.x as f64) + (self.radius as f64) * i.cos();
// let y = (self.center.y as f64) + (self.radius as f64) * i.sin();
// image.display(x.round() as i32, y.round() as i32, color.clone());
// i += steps;
// }
// }
// }
