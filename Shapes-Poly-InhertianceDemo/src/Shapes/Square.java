package Shapes;

public class Square extends Shape
{
    double len;
    double width;

    public Square(String color, String type, int sides, double len, double width)
    {
        //Super method calls base Ctor
        super(color,type,sides);
        if(len == width)
        {
            this.len = len;
            this.width = width;
            this.area = getArea();
        }
        else
        {
            len = 0;
            width = 0;
        }

    }
    @Override
    public double getArea()
    {
        return len * width;
    }

}
