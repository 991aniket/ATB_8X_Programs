package Task.Sept_20_24;
import java.util.Scanner;

public class Task_12_Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int year = sc.nextInt();
        if (year%4==0 && year%100!=0)
        {
            System.out.println(year+" it is a Leap year ");
        }else {
            System.out.println(year+" it is not a leap year");
        }

    }
}
