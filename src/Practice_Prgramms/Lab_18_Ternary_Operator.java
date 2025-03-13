package Practice_Prgramms;

public class Lab_18_Ternary_Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int max = a > b ? a : b;
        int min = a < b ? a : b;
        System.out.println("Max Between 2 numbers -"+max);
        System.out.println("Min Between 2 numbers -"+min);
    }
}
