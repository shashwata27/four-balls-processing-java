public class balls {
    private final int ballSpeed;
    public xPostions ballPosition;

    public balls(int ballSpeed){
        this.ballSpeed = ballSpeed;
        this.ballPosition = new xPostions(0);
    }

    public void moveBall(){
        this.ballPosition.increaseXPostion(this.ballSpeed);
    }

    public int getBallPostion(){
        return this.ballPosition.getXPostion();
    }

    public int getBallSpeed(){
        return this.ballSpeed;
    }
}
