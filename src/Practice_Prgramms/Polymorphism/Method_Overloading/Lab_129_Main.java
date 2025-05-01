package Practice_Prgramms.Polymorphism.Method_Overloading;

public class Lab_129_Main
{
    public static void main(String[] args) {
        Lab_128_Greet G = new Lab_128_Greet();

        G.sayHello();
        G.sayHello("Aniket");
        G.sayHello("Kiran",26);
        System.out.println("-----------------------");
    }
}
