package Shapes;

/**Tester Class for Shape
 * Demonstrates
 *      Interface extension
 *      Polymorphism
 *      Inheritance
 */
public class Main
{
    public static void main(String ... args)
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
        System.out.println("s1 " + s1);
        System.out.println("s2 " + s2);
        System.out.println("s3 " + s3);
        //upcast
        s1 = s2;
        System.out.println("s1 " + s1);
        s1 = (Shape)s1;
        s1 = (Circle)s3;
        //downcast
        s3 = (Circle)s1;
        System.out.println("s1 " + s3);
    }

}

