package Task.Sept_20_24;
import java.util.Scanner;

public class Task_09_Ternary_Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value between 0-100 ");
        int marks = sc.nextInt();
        if (marks<=100 && marks>0) {
            String grade = (marks >= 90) ? "A" :
                    (marks >= 80) ? "B" :
                            (marks >= 70) ? "C" : "F";
            System.out.println(grade);
        }
        else {
            System.out.println("Enter Correct Value");
        }
    }
}
