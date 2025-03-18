package Practice_Prgramms;

public class Lab_33_Switch
{
    public static void main(String[] args)
    {
        //multiple Switch cases are possible JDK > 13
        // In this we can use multiple Statements in case
        int item_code = 003;
        switch (item_code)
        {
            case 001, 002, 003:
                System.out.println("All Electronic items");
                System.out.println("All Electronic items");
                System.out.println("All Electronic items");
                break;

            case 004, 005, 006:

                System.out.println("all Grocery items");
                System.out.println("all Grocery items");
                System.out.println("all Grocery items");
                break;

            default:

                System.out.println("Error");
                System.out.println("Error");
                System.out.println("Error");
                break;
        }


    }
}

