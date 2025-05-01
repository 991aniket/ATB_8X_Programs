package Practice_Prgramms.Polymorphism.Method_Overloading;

public class Lab_128_Greet
{
    void sayHello()
    {
        System.out.println("Hello !");
    }
    void sayHello(String name)
    {
        System.out.println("Hello "+name+"!");
    }
    void  sayHello(String name, int age)
    {
        System.out.println("Hello, "+name+". you are "+age+" years old.");
    }
}
