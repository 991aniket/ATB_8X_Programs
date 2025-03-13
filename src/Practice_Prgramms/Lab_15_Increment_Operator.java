package Practice_Prgramms;

public class Lab_15_Increment_Operator {
    public static void main(String[] args) {
        // Increment (++) / Decrement (--) Operators
        // Pre and Post
        // Ready

//        // pre - increment - ++operand.
//        // value is incremented first and then stored in the result.
        int a  = 10;
        int b  = ++a; // a = a+1
//        //  | a |output (b)|
//        //   10
//        //   11 | 11
       System.out.println(b);
       System.out.println(a);

       int c = 10;
       System.out.println(++c);
       System.out.println(c);

        // Post  a++
        // Print first and then increase
        int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post);
    }
}
