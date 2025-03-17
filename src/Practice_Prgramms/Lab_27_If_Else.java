package Practice_Prgramms;

public class Lab_27_If_Else {
    public static void main(String[] args) {
        // ✅ Grade Calculator
        // Write a program that calculates and displays
        //        the letter grade for a given numerical
        //        score (e.g., A, B, C, D, or F)
        //        based on the following grading scale:
        //        A: 90-100
        //        B: 80-89
        //        C: 70-79
        //        D: 60-69
        //        F: 0-59

        //  90 -> A
        // 87 -> B
        // 23 -> F

        // Logic Building - Java


        // 1. Find the user Inputs
        // score -> int score = 89 ;
        // return -> data - type - grade -> char


        // 2. Basic Logic
        // if ( score >= 90 && score <= 100 ) -> return or print grade - A
        // else if score <=89 && score >= 80 -> return or print grade - B
        // else if score <=79 && score >= 70 -> return or print grade - C
        // D,E
        //  // else -> grade -> F


        // 3. Write the code

        int a= -99;

        if (a>=90&&a<=100)
            System.out.println("Grade A");
        else if (a>=80&&a<=89) {
            System.out.println("Grade B");
        } else if (a>=70&&a<=79) {
            System.out.println("Grade c");
        } else if (a>=60&&a<=69) {
            System.out.println("Grade D");
        } else if (a>=0&&a<=59) {
            System.out.println("Grade F");
        } else if (a<=0||a>=100) {
            System.out.println("Please enter valid Marks");
        }
    }
}
