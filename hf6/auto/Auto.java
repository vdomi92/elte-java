package auto;
import auto.utils.*;

public class Auto{
    private static int counter = 0;

    private String plateNum;
    private Color color;
    private int maxSpeed;

    public Auto(){
        this.plateNum = "AAA-000";
        this.color = Color.BLUE;
        this.maxSpeed = 120;
        increment();
    }
    public Auto(String plateNum, Color color, int maxSpeed){
        this.plateNum = plateNum;
        this.color = color;
        this.maxSpeed = maxSpeed;
        increment();
    }

    public static void increment(){
        counter++;
    }

    public int getSpeed(){
        return this.maxSpeed;
    }

    public static int getCounter(){
        return counter;
    }

    public boolean compareCars(Auto car1, Auto car2){
        return car1.getSpeed() > car2.getSpeed();
    }

    public static void main(String[] args){

    }
}