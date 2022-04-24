package chaos;

import processing.core.PApplet;

public class Main extends PApplet {
    double x = 0.1, y = 0.1;

//    static final float a =  0.45F, b = 1.9F;
//    static final float a =  1.0F, b = 0.85F;
//    static final float a =  1.0F, b = 0.9F;
    static final float a = 1.25F, b = 0.75F;

    @Override
    public void settings() {
        size(800, 800);
    }

    @Override
    public void setup() {
        blendMode(ADD);
        background(0);
        stroke(255);
    }

    @Override
    public void draw() {
        float _x, _y;

        for (int i = 0; i < 100; i++) {

            _x = (float) ((1 + a * b) * x - b * x * y);
            _y = (float) ((1 - b) * y + b * x * x);

            point((float) (_x * 100 + width*0.5),(float) (- _y * 100 + height*0.75));

            x = _x;
            y = _y;
        }
    }

    public static void main(String[] args){
        String[] processingArgs = {"Main"};
        Main main = new Main();
        PApplet.runSketch(processingArgs, main);
    }
}
