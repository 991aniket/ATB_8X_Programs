package Practice_Prgramms;

public class Lab_09_Relational_Operators {
    public static void main(String[] args)
    {
        // Relational Operators  = boolean
        //  > < , >= <= , != , ! -> true or false
        int a = 10;
        int b = 30;

        System.out.println(a>b);  // Greater than
        System.out.println(a<b);  // Less than

        int age_kiran = 29;
        int age_aniket = 25;

        System.out.println(age_kiran>=age_aniket); // greater than Equal too
        System.out.println(age_kiran<=age_aniket);  // Less than equal too
        System.out.println(age_kiran!=age_aniket);  // Not equal too
        System.out.println(age_kiran==age_aniket); // Compare the value
    }
}
