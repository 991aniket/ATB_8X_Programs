package Task.Sept_20_24;
import java.util.Scanner;

public class Task_08_Ternary_Operator {
    public static void main(String[] args) {
//        ✅ By using Ternary Operators max between 3 numbers.
//
// Input int - a,b,c - a = 10, b = 20, c = 45

// Max → a,b,c → c
        System.out.println("Input 1");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Input 2");
        int b = sc.nextInt();
        System.out.println("Input 3");
        int c = sc.nextInt();
        int max  =(a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("Max between 3 -> "+max);


    }
}
