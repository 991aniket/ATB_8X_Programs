package Practice_Prgramms;

public class Lab_07_Example_Concatenation
{
    public static void main(String[] args) {
        String first_name="Aniket";
        String Last_name="Pawar";
        int a=10; int b = 35;
        System.out.println(first_name+Last_name);
        System.out.println(first_name+Last_name+(a+b));
        System.out.println(first_name+a+Last_name+b);
        System.out.println(a+b+first_name+Last_name);
    }
}
