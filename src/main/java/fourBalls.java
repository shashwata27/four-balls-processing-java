import processing.core.PApplet;

public class fourBalls extends PApplet {
    public static final int WIDTH = 1200;
    public static final int HEIGHT = 800;
    public static final int RADIUS = 25;

    int x=0;


    public static void main(String[] args) {
        PApplet.main("fourBalls", args);

    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        balls ballOne = new balls(1);
        balls ballTwo = new balls(2);
        balls ballThree = new balls(3);
        balls ballFour = new balls(4);


        drawCircle(ballOne);
        drawCircle(ballTwo);
        drawCircle(ballThree);
        drawCircle(ballFour);

        x++;

    }

    private void drawCircle(balls ball) {
        ellipse( x* ball.getBallSpeed(), HEIGHT / 5 * ball.getBallSpeed(), RADIUS, RADIUS);
    }

}
