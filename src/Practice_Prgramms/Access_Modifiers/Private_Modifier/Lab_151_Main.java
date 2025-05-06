package Practice_Prgramms.Access_Modifiers.Private_Modifier;

public class Lab_151_Main
{
    public static void main(String[] args) {
        Lab_150_Account a = new Lab_150_Account();
        // acc.balance; ❌ Not allowed (private)
        // acc.displayBalance(); ❌ Not allowed (private)
        a.accessBalance();// ✅ Allowed (uses public method)

    }
}
