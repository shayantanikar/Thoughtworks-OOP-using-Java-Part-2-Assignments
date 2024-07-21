import processing.core.PApplet;

public class MyProcessingSketch extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    private Ball[] balls;

    public static void main(String[] args) {
        PApplet.main("MyProcessingSketch");
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        balls = new Ball[4];
        balls[0] = new Ball(this, 0, HEIGHT / 5, 1);
        balls[1] = new Ball(this, 0, (2 * HEIGHT) / 5, 2);
        balls[2] = new Ball(this, 0, (3 * HEIGHT) / 5, 3);
        balls[3] = new Ball(this, 0, (4 * HEIGHT) / 5, 4);
    }

    @Override
    public void draw() {
        for (Ball ball : balls) {
            ball.x+=ball.speed;
            ball.display();
        }
    }

    class Ball {
        PApplet p;
        float x;
        float y;
        float speed;

        Ball(PApplet p, float x, float y, float speed) {
            this.p = p;
            this.x = x;
            this.y = y;
            this.speed = speed;
        }


        void display() {
            p.ellipse(x, y, DIAMETER, DIAMETER);
        }
    }
}
