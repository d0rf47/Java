package Shapes;

public class Circle extends Shape
{
    private double radius;

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
