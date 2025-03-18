package Practice_Prgramms;

public class Lab_34_Switch {
    public static void main(String[] args) {
        // -> arrow represents break statement in Switch
        // in this case we can write only single Statement in case
        int a= 004;
        switch (a)
        {
            case 001 -> System.out.println("Aniket");
            case 002,003 -> System.out.println("aniket"+"Pawar");
            case 004 -> System.out.println("Aniket"+"niwas"+"Pawar");
            default -> System.out.println("Error");
        }
    }
}
