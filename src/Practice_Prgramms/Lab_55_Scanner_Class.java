package Practice_Prgramms;
import java.util.Scanner;

public class Lab_55_Scanner_Class {
    public static void main(String[] args) {
        // How to take a use input form user

        Scanner sc = new Scanner(System.in); // New object
        System.out.println("Enter the User ID");
        int num = sc.nextInt();
        System.out.println("Valid ID "+num);
        System.out.println();
        System.out.println("Enter your age");
        byte age =sc.nextByte();
        System.out.println("Validated "+age);
        System.out.println("Enter your Name ");
        String name =sc.next();
        System.out.println("Your Name "+name);

    }
}
