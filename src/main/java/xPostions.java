public class xPostions {
    public int x;

    public xPostions(int x){
        this.x=x;
    }

    public void increaseXPostion(int increment){
        this.x+=increment;
        System.out.println(this.x);
    }

    public int getXPostion(){
        return this.x;
    }
}
