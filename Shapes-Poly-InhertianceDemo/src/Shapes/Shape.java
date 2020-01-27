package Shapes;

/** Hierarchy base class
 * Is also an abstract class because of
 * one abstract method
 * Implements the Shape Interface
 * */
public abstract class Shape implements Cloneable, ShapeInterface
{
    private String color;
    public String type;
    private int sides;
    protected double area;

    /** 3 Arg Ctor
     *
     * @param color (String)
     * @param type  (String)
     * @param sides (int)
     */
    public Shape(String color,String type, int sides)
    {
        this.color=color;
        this.sides = sides;
        this.type = type;
        this.area = 0;
    }
    @Override
    /** Overrides the Object toString method
     */
    public String toString()
    {
        return "Runtime Object: " + this.getClass()
                + " " + type + " with " + sides + " sides and an area of " + area;
    }

    /**
     * Abstract method
     * @return double
     * Overridden in each subClass
     */
    public abstract double getArea();

    /** A custom comparator function usable on any class derived from a shape
     * and can be compared with any other object within
     * the hierarchy
     * @param o (Object type, Can be any object type within the hierarchy
     * */
    @Override
    public boolean equals(Object o)
    {
        if(this == o) return true;

        if(!(o instanceof Shape)) return false;

        Shape s = (Shape) o;
        return (this.color.equals(s.color) && this.type.equals(s.type)
            && Double.compare(this.area,s.area) == 0 && Integer.compare(this.sides,s.sides) == 0);
    }

    /** Overrides the default clone method
     * enabling the Shape class to create clones
     * @return Shape
     * @throws CloneNotSupportedException Indicates the clone method could not be properly implemented
     */
    @Override
    protected Object clone()
            throws CloneNotSupportedException
    {
        System.out.println("Cloning " + this.getClass());
        return super.clone();
    }


}
