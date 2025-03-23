package Task.Sept_23_24;
import java.util.Scanner;

public class Task_15_Switch_Statement {
    public static void main(String[] args) {
//        Write a program that converts between different units
//        (e.g., kilometers to miles, Celsius to Fahrenheit)
//        based on user selection using a switch statement.
//        Input. -
//        choice - 1 - km → m, km → 1km
//        choice - 2 - f → c, f → c
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter value");
        double a =sc.nextDouble();
        System.out.println("enter conversion type (eg - KM , C)");
        String s = sc.next();
        if (s.equals("KM") || s.equals("C"))
        {
            switch (s)
            {
                case "KM":
                    System.out.println(a*1000 +" m");
                    break;
                case "C" :
                    System.out.println((a*9/5)+32 +" F");
                    break;

            }
        }
       else
        {
            System.out.println("Looks like you entered wrong value ");
        }

    }
}
