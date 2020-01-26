package bicycles;

public class MountainBike extends Bicycles
{
    public int seatHeight;

    /** Ctor method, explicitly invokes the super class Ctor method */
    public MountainBike(int seatHeight, int cadence, int speed, int gear)
    {
        super(cadence, gear, speed);
        this.seatHeight = seatHeight;
    }

    public void setSeatHeight(int seatHeight)
    {
        this.seatHeight = seatHeight;
    }
    public void viewBike()
    {
        System.out.println("Mountain Bike");
        System.out.println("Cadence: " + this.cadence);
        System.out.println("Seat Height: " + this.seatHeight);
        System.out.println("Gears: " + this.gear);
        System.out.println("speed: " + this.speed);
    }
}
