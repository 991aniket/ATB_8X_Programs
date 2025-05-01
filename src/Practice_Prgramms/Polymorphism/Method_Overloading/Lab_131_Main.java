package Practice_Prgramms.Polymorphism.Method_Overloading;

public class Lab_131_Main
{
    public static void main(String[] args) {
        Lab_130_MathOperations M = new Lab_130_MathOperations();

        int r1=M.add(21,32);
        System.out.println(r1);
        System.out.println("-----------------------");

        int r2=M.add('A','z');
        System.out.println(r2);
        System.out.println("-----------------------");

        double r3=M.add(90.9,54.2);
        System.out.println(r3);
        System.out.println("-----------------------");

        String r4= M.add("Aniket", " Pawar");
        System.out.println(r4);
        System.out.println("-----------------------");
    }
}
