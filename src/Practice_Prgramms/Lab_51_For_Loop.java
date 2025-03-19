package Practice_Prgramms;

public class Lab_51_For_Loop {
    public static void main(String[] args) {
        for (int i = 0; i <=10; i++) {
            if (i%2==0)
            {
                System.out.println("even"+ i);
                continue;
            }
            System.out.println(i);
        }
    }
}
