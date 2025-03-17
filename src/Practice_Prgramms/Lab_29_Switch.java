package Practice_Prgramms;

public class Lab_29_Switch {
    public static void main(String[] args) {
        // Switch Condition
        // Days - 1 to 7 ->  1 mon, 2 - tue, 7 - sun...
        //Without using break
        int day= 7;
        switch (day) {
            case 7:
                System.out.println("Saturday");

            case 6:
                System.out.println("Friday");

            case 5:
                System.out.println("Thursday");

            case 4:
                System.out.println("wednesday");

            case 3:
                System.out.println("Tuesday");

            case 2:
                System.out.println("Monday");

            case 1:
                System.out.println("Sunday");

            default:
                System.out.println("Something went wrong");

        }
    }
}
