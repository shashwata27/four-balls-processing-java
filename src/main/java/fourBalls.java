import processing.core.PApplet;

public class fourBalls extends PApplet {
    public static final int WIDTH = 1200;
    public static final int HEIGHT = 800;
    public static final int RADIUS = 25;
    int x = 0;


    public static void main(String[] args) {
        PApplet.main("fourBalls", args);

    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircle(1);
        drawCircle(2);
        drawCircle(3);
        drawCircle(4);
    }

    private void drawCircle(int multipler) {
        ellipse(x * multipler, (HEIGHT / 5) * multipler, RADIUS, RADIUS);
        x++;
    }

}
