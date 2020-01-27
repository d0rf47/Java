package Shapes;

/**
 * Package Interface with common method prototypes for each SubClass
 */
public interface ShapeInterface
{
    @Override
    String toString();
    @Override
    boolean equals(Object o);
    double getArea();

}

