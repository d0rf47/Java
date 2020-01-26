package bicycles;

public class Bicycles
{

    /** Fields */
    public int cadence;
    public int gear;
    public int speed;

    /**Ctor Method */
    public Bicycles(int cadence, int gear, int speed)
    {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;

    }

    /** manipulator methods */
    public void setCadence(int cadence)
    {
        this.cadence = cadence;
    }

    public void setGear(int gear)
    {
        this.gear = gear;
    }

    public void applyBrake(int decrement)
    {
        this.speed -= decrement;
    }

    public void speedUp(int increment)
    {
        this.speed += increment;
    }
}
