package Practice_Prgramms.Access_Modifiers.Private_Modifier;

public class Lab_150_Account
{
    private double bal=100000.00;

    private void displayBalance()
    {
        System.out.println("Balance "+ bal);
    }

    public void accessBalance ()
    {
        displayBalance();
    }
}
