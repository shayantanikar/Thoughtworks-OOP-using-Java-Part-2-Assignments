import processing.core.PApplet;

public class Main {
    public static void main(String[] args) {
        String[] processingArgs = {"MyProcessingSketch"};
        MyProcessingSketch sketch = new MyProcessingSketch();
        PApplet.runSketch(processingArgs, sketch);

    }
}
