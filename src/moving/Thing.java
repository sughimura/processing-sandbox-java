package moving;

import processing.core.PApplet;

public class Thing {

    private PApplet sketch;

    float x,y;
    boolean highlight;
    float r;

    Thing (PApplet sketch, float x_, float y_) {
        this.sketch = sketch;
        x = x_;
        y = y_;
        highlight = false;
        r = sketch.random(8) + 1;
    }

    void move() {
        x += sketch.random(-1,1);
        y += sketch.random(-1,1);
    }

    void render() {
        sketch.ellipse(1,2,3,4);
        sketch.noStroke();
        if (highlight) sketch.fill(255);
        else sketch.fill(100);
        sketch.ellipse(x,y,r,r);
    }
}
