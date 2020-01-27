package Shapes;

public class Triangle extends Shape
{
    double height;
    double base;

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
