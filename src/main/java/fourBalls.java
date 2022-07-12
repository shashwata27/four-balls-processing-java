import processing.core.PApplet;

import java.util.ArrayList;

public class fourBalls extends PApplet {
    public static final int WIDTH = 1200;
    public static final int HEIGHT = 800;
    public static final int RADIUS = 25;

//    public static int x=0;

    ArrayList<balls> ballsArray=new ArrayList<>();


    public static void main(String[] args) {
        PApplet.main("fourBalls", args);

    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        for (int i = 1; i<=4; i++) {
            balls ball = new balls(i);
            ballsArray.add(ball);
        }
    }


    @Override
    public void draw() {
        for (int i = 0; i <4; i++) {
            balls ball=ballsArray.get(i);
            drawCircle(ball);
            ball.moveBall();
        }
        System.out.println("End of round.");

//        x++;

    }

    private void drawCircle(balls ball) {
        ellipse( ball.returnBallPostion()* ball.getBallSpeed(), HEIGHT / 5 * ball.getBallSpeed(), RADIUS, RADIUS);
    }

}
