import processing.core.PApplet;

public class MyProcessingSketch extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static int DIAMETER = 10;
    public int w,x,y,z;

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        drawBalls();
    }

    private void drawBalls(){
        ellipse(w, HEIGHT/5, DIAMETER, DIAMETER);
        w++;
        ellipse(x, (2*HEIGHT)/5, DIAMETER, DIAMETER);
        x+=2;
        ellipse(y, (3*HEIGHT)/5, DIAMETER, DIAMETER);
        y+=3;
        ellipse(z, (4*HEIGHT)/5, DIAMETER, DIAMETER);
        z+=4;
    }

    public static void main(String[] args) {
        PApplet.main("MyProcessingSketch");
    }
}
