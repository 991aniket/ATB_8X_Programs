package Task.Sept_25_24;
import java.util.Scanner;

public class Task_17_While_loop {
    public static void main(String[] args) {
//Factorial Program - n = 5 , Output = 120
//n = 5 ->  Fact = 5*4*3*2*1 = 12
// n = 1 ->  Fact = 1*1 -> 1
// n = 3 -> Fact = 3*2*1 -> 6
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int b=a;
        int f=1;
        while(a>0)
        {
            f=f*a;
            a--;
        }
        System.out.print("Factorial of " +b+" is " );
        System.out.println(f);

    }
}
