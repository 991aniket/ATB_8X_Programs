package Task.Sept_18_24;

public class Task_07_Increment_Decrement {
    public static void main(String[] args) {
        int a = 10;
       int r = a+a++ +a+a-- +a + ++a;
        System.out.println(r);
        System.out.println(a);
        int b = 10;
        int r1 =--b+b++ +b--;
        System.out.println(r1);
        System.out.println(b);
        int c =10;
        int r2 = c-- +c-- +c--;
        System.out.println(r2);
        System.out.println(c);

    }
}
