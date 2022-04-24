package chaos;

import processing.core.PApplet;

public class Main extends PApplet {

    @Override
    public void settings() {
        size(640, 360);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
    }

    public static void main(String[] args){
        String[] processingArgs = {"Main"};
        Main main = new Main();
        PApplet.runSketch(processingArgs, main);
    }
}
