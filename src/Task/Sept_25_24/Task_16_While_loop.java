package Task.Sept_25_24;
import java.util.Scanner;

public class Task_16_While_loop {
    public static void main(String[] args) {
      //  Table of number n = 10, print table with For or while.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print the table");
        int num = sc.nextInt();
        System.out.println("Table of "+num);
        int a = 1;
        while(a<=10)
        {
            System.out.print(num + " * " + a +" = ");
            System.out.println(num*a);
            a++;
        }
        System.out.println("thank you very much");

    }
}
