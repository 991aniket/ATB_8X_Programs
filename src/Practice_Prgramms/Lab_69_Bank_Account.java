package Practice_Prgramms;

public class Lab_69_Bank_Account {
    String accountHolder;
    int balance;

    void checkBalance()
    {
        System.out.println("Your Account balance is "+ balance);
    }

    void deposite(double amount)
    {
        if (amount>=500)
        {
            balance +=amount;
            System.out.println("Amount deposited successfully ");
            System.out.println("Your current balance is  "+ balance);
        }
        else {
            System.out.println("Please enter amount in 500 , 2000");
        }


    }

    void withdraw(double amount)
    {
        if (amount>=500) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdraw Successfull");
                System.out.println("Your Balance is " + balance);
            } else {
                System.out.println("Insufficient Balance");
            }
        }
        else{
            System.out.println("Please enter amount in 500 , 2000");
        }
    }
}
