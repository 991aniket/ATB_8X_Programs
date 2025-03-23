package Task.Sept_20_24;
import java.util.Scanner;



public class Task_11_FizzBuzz_Test {
    public static void main(String[] args) {
//        ✅ FizzBuzz Test:
//
//        Write a program that prints numbers from 1 to 100.
//        However, for multiples of 3, print "Fizz" instead of the number,
//        and for multiples of 5, print "Buzz."
//        For numbers that are multiples of both 3 and 5, print "FizzBuzz."

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int a = Sc.nextInt();
        if (a>=1 && a<=100)
        {
            if (a%3==0 && a%5==0)
            {
                System.out.println("FizzBuzz");
            } else if (a%3==0)
            {
                System.out.println("Fizz");
            } else if (a%5==0)
            {
                System.out.println("Buzz");
            }else {
                System.out.println(a);
            }
        }
        else {
            System.out.println("enter a valid number ranging from 1 to 100");
        }


    }
}
