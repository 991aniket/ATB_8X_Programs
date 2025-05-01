package Practice_Prgramms.Polymorphism.Method_Overloading;

public class Lab_126_AreaCalculator
{
    void area(int side)
    {
        System.out.println("Area of Square : "+(side*side));
    }
    void area (int length ,int breadth)
    {
        System.out.println("Area of rectangle : "+(length * breadth));
    }
    void area(double radius)
    {
        System.out.println("Area of circle : "+(3.14*radius*radius));
    }
}
