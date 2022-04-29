package actvities;

public class Activity1 {

    public static void main(String[] args)
    {
        Car Toyota = new Car();
        Toyota.scolor="Blue";
        Toyota.sTransmission="Automatic";
        Toyota.iMake=2020;

        Toyota.displayCharacteristics();
        Toyota.accelarate();
        Toyota.brake();

    }

    public static class Car   {

        String scolor;
        String sTransmission;
        int iMake;
        int iTyres;
        int iDoors;

        Car (){
            iTyres=4;
            iDoors=4;
        }

        public void displayCharacteristics(){
            System.out.println("Color: " +scolor);
            System.out.println("sTransmission: " +sTransmission);
            System.out.println("iMake: " +iMake);
            System.out.println("iTyres: " +iTyres);
            System.out.println("iDoors: " +iDoors);
        }

        public void accelarate() {
            System.out.println("Car is moving forward.");
        }

        public void brake() {
            System.out.println("Car has stopped.");
        }

    }


}
