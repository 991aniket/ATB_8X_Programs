package Task.Sept_20_24;
import java.util.Scanner;

public class Task_10_If_Else {
    public static void main(String[] args) {
      //  ✅ Triangle Classifier ( If)

// Write a program that classifies a triangle based on its side lengths.

// Given three input values representing the lengths of the sides, determine

// if the triangle is equilateral (all sides are equal),

// isosceles (exactly two sides are equal), or

// scalene (no sides are equal).

// Use an if-else statement to classify the triangle.

// side1, side2, side3 ->
        Scanner sc = new Scanner(System.in);
        System.out.println("Value 1");
        int a = sc.nextInt();
        System.out.println("Value 2");
        int b = sc.nextInt();
        System.out.println("Value 3");
        int c = sc.nextInt();
        if (a==b && b==c && c==a)
        {
            System.out.println("it is an equilateral");
        } else if (a==b || b==c || a==c)
        {
            System.out.println("it is an isosceles");

        } else if (a!=b && b!=c & c!=a ) {
            System.out.println("It is a Scalene");

        }


    }
}
