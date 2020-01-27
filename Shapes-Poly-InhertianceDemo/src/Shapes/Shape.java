package Shapes;

/** Hierarchy base class */
public abstract class Shape implements ShapeInterface
{
    private String color;
    private String type;
    private int sides;
    protected double area;

    public Shape(String color,String type, int sides)
    {
        this.color=color;
        this.sides = sides;
        this.type = type;
        this.area = 0;
    }
    @Override
    public String toString()
    {
        return color + " " + type + " with " + sides + " sides and an area of " + area;
    }
    public abstract double getArea();






}
