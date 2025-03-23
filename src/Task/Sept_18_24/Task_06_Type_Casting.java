package Task.Sept_18_24;

public class Task_06_Type_Casting {
    public static void main(String[] args) {
        //Give some another example of Widening with Implicit and Explicit, Narrowing with implicit and explicit.

        System.out.println("widening");
        int a = 1000;
        long b= a; // implicit widening
        System.out.println("implicit widening-"+b);
        int c =1000;
        double d = (double)c;// explicit widening
        System.out.println("explicit widening-"+d);
        System.out.println();
        System.out.println("Narrowing");
        int a1 = 155;
        byte b1 = (byte) a1;
        System.out.println("vaule a1 -"+a1);
        System.out.println("explicit narrowing-"+b1);
        float f1=1999.99f;
        int f2=(int)f1;
        System.out.println("value of f1-"+f1);
        System.out.println("explicit narrowing-"+f2);


    }
}
