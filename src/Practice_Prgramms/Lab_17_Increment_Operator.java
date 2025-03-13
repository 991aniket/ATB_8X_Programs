package Practice_Prgramms;

public class Lab_17_Increment_Operator {
    public static void main(String[] args) {
        System.out.println("example 1");
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);
        // A -> a++ -> 10 , a= 11
        // + -> operator
        // B -> ++a  -> a= 12 exp -> 12

        // Line no | a  |  Exp
        // 5   | 10 | NA
        // 6  | 12 | 10 + 12
        System.out.println("example 2");
        int b = 10;
        System.out.println(++b + ++b);
        System.out.println(b);

        // A  -> ++a ->  Exp1 -> 11 , a = 11
        //  +
        // B- > ++a  ->  a = 12 , Exp2 = 12
        // 23 , 12
        System.out.println("example 3");
        int c = 10;
        System.out.println(++c + c++ + c++);
        System.out.println(c);
        //  Part ->  A -> ++a , Exp1 = 11 , a = 11
        //  Part ->  B -> a++ , Exp2 = 11 , a = 12
        //  Part ->  C -> a++, Exp3 = 12 , a = 13


    }

}
