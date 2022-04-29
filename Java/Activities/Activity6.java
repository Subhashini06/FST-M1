package actvities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers= new ArrayList<>();
    }

    public void onBoard(String passenger) {
        this.passengers.add(passenger);
    }

    public Date takeOff() {
        this.lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }

    public void land() {
        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }

    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    public List<String> getPassesngers(){
        return passengers;
    }


}

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane plane = new Plane(10);
        plane.onBoard("Mark");
        plane.onBoard("John");
        plane.onBoard("Stephen");

        System.out.println("Plan Took of" +plane.takeOff());
        System.out.println("People in the plane" +plane.getPassesngers());
        Thread.sleep(5000);
        plane.land();
        System.out.println("Plan Landing" +plane.getLastTimeLanded());
        System.out.println("People on the Plan after Landing" +plane.getPassesngers());
    }

}
