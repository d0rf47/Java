package Shapes;
/**
 * Extends the Base Shape Class
 */
public class Circle extends Shape
{
    private double radius;

    /**
     * Invokes Super Method and calculates Area based on Class specific overload
     * @param color (String)
     * @param type  (String)
     * @param sides (int)
     * @param radius (double)
     */
    public Circle(String color, String type, int sides, double radius)
    {
        //super method explictly invokes base Ctor
        super(color,type,sides);
        this.radius = radius;
        this.area = getArea();
    }
    @Override
    public double getArea()
    {
        return Math.PI * (radius * radius);
    }
}
