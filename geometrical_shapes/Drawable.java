package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

interface Drawable {
    void draw(Displayable displayable);

    default Color getColor() {
        Random random = new Random();
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);

        return new Color(r, g, b);
    }
}
