package Practice_Prgramms.Encapsulation;

public class Lab_140_Atm
{
    private double bal=10000.00;

    public double getBal(String pin)
    {
        if (pin.equals("1234"))
        {
            return bal;
        } else
        {
            System.out.println("Invalid Pin");
            return 0.0;
        }
    }

    public void withdraw(String pin ,double amount)
    {
        if (pin.equals("1234")&&amount<=bal)
        {
            bal -=amount;
            System.out.println(bal);
            System.out.println("withdraw successfull");
        }
        else
        {
            System.out.println("Something went wrong");
        }
    }

}
