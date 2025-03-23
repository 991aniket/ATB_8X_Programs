package Task.Sept_23_24;
import java.util.Scanner;

public class Task_13_Switch_Statement {
    public static void main(String[] args) {
//        Create a simple calculator that performs addition, subtraction, multiplication, division and moduls
//        based on user input using switch statements.
//
//                Inputs :   num 1, num 2, +
//                Output :  num1+num2 → print information.
        Scanner sc = new Scanner(System.in);
        System.out.println("input 1");
        int num1 =sc.nextInt();
        System.out.println("input 2");
        int num2 = sc.nextInt();
        System.out.println("enter operator symbol");
        String op =sc.next();

        switch(op)
        {
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            case "%":
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("something went wrong please re-start");
        }
    }
}
