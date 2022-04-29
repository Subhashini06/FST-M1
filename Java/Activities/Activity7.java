package actvities;

interface BicycleParts {
    public int gears = 0;
    public int speed = 0;
}

interface BicycleOperations {
    public void applyBrake (int decrement);
    public void speedUp(int increment);
}


class Bicycle implements BicycleParts, BicycleOperations {
    public int gears;
    public int speed;

    public Bicycle(int gears, int speed) {
        this.gears = gears;
        this.speed = speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
        System.out.println("Current speed: " + speed);
    }

    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Current speed: " + speed);
    }

    public String bicycleDesc() {
        return("No of gears" +gears +"\n Speed of Bicycle" +speed);
    }
}

class MountainBike extends Bicycle {
    public int seatHeight;


    public MountainBike(int gears, int speed, int sHeight) {
        super(gears, speed);
        seatHeight = sHeight;
    }

    public void setSeatHeight(int height) {
        seatHeight = height;
    }

    public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
    }
}


public class Activity7 {
    public static void main(String[] args) {
        MountainBike mbk = new MountainBike(4, 10,100);
        System.out.println(mbk.bicycleDesc());
        mbk.speedUp(30);
        mbk.applyBrake(10);

    }

}
