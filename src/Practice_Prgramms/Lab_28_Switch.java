package Practice_Prgramms;

public class Lab_28_Switch {
    public static void main(String[] args) {
        // Switch Condition
        // Days - 1 to 7 ->  1 mon, 2 - tue, 7 - sun...
        int day= 5;
        switch (day) {
            case 7:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Something went wrong");
        }

    }
}
