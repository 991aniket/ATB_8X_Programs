package Practice_Prgramms;

public class Lab_50_For_Loop {
    public static void main(String[] args) {
        // use of continue statement
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if (i==3)
            {
                continue;  // works like if else
            }
            System.out.println("outside loop");
        }
    }

}
