public class Timecheck{
    private int speed;
    private int size;
    private int time;

    public Timecheck(){   
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTime(){
        time = size/speed;
        return time;
    }
    
}