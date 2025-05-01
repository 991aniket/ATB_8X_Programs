package Practice_Prgramms.Polymorphism.Method_Overloading;

public class Lab_125_Main
{
    public static void main(String[] args) {

        //                    Method Overloading
        // Same method same with different behaviour/Parameter/Arguments

        Lab_124_Printer P = new Lab_124_Printer();

        P.print("Aniket");
        P.print(1999);
        P.print(99.9);

        System.out.println("-----------------------");
    }
}
