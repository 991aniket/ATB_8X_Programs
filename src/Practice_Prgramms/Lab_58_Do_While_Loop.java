package Practice_Prgramms;

public class Lab_58_Do_While_Loop {
    public static void main(String[] args) {

        // Difference in do while & while loop
        System.out.println("While Example");
        int a= 5;
        while (a<1)
        {
            System.out.println("Print :"+a);
            a++;
        }

        System.out.println("Do While Example");
        int b=5;
        do
        {
            System.out.println("Print :"+b);
            b++;
        }while (b<1);

    }
}
