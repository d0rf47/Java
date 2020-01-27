package Shapes;
/**Tester Class for Shape
 * Demonstrates
 *      Interface extension
 *      Polymorphism
 *      Inheritance
 *      Abstract base Classes
 *      True Polymorphic equality
 * @author Michael Falconi
 */
public class Main
{
    public static void main(String ... args) throws
                CloneNotSupportedException
    {
        Circle s3 = new Circle("red", "Circle", 1 , 3.5);
        Square s2 = new Square("blue", "square", 4, 5, 5);
        /** Special instantiation of an abstract base class
         *  utilizing an anonymous class implementation
         */
        Shape s1 = new Shape("Green", "Shape", 0) {
            @Override
            public double getArea() {
                return this.area;
            }
        };
        //upcast
        Shape s4 = new Triangle("Yellow", "Triangle", 3, 3.5, 2.5);
        System.out.println("s1 " + s1);
        System.out.println("s2 " + s2);
        System.out.println("s3 " + s3);
        System.out.println("s4 " + s4);
        //upcast
        s1 = s2;
        System.out.println("s1 == s2 " + s1.equals(s2));
        System.out.println("s1 " + s1);
        s1 = (Shape)s1;
        s1 = (Circle)s3;
        //downcast
        s3 = (Circle)s1;
        System.out.println("s3 " + s3);
        System.out.println("S1 == s4 " + s1.equals(s4));
        Shape Clone = (Shape)s1.clone();
        System.out.println("s5 " + Clone);
        System.out.println("Clone == s1 " + Clone.equals(s1));
        Clone = (Shape)s2.clone();
        System.out.println("Clone == s1 " + Clone.equals(s1));
        System.out.println("Clone == s2 " + Clone.equals(s2));
        System.out.println(Clone);
    }

}

