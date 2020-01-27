package Shapes;
/**
 * Extends the Base Shape Class
 */
public class Triangle extends Shape
{
    double height;
    double base;

    /**
     * Invokes Super Method and calculates Area based on Class specific overload
     * @param color (String)
     * @param type  (String)
     * @param sides (int)
     * @param height (double)
     * @param base   (double)
     */
    Triangle(String color, String type, int sides, double height, double base)
    {
        super(color,type,sides);
        this.height =height;
        this.base = base;
        this.area = getArea();
    }
    @Override
    public double getArea()
    {
            return (base * height) / 2.0;
    }
}
