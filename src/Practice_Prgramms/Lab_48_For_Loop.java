package Practice_Prgramms;

public class Lab_48_For_Loop {
    public static void main(String[] args) {
        // Print all the Even Numbers from 0 to 50
        for (int i = 0; i <=50; i++) {
            if (i%2==0)
            {
                System.out.println("Even " + i);
            }
            else {
                System.out.println(i);
            }

        }
    }
}
