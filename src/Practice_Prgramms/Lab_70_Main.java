package Practice_Prgramms;

public class Lab_70_Main {
    public static void main(String[] args) {
        Lab_69_Bank_Account sc = new Lab_69_Bank_Account();
        System.out.println(sc.accountHolder="Aniket Pawar");
        sc.balance=7500;
        sc.checkBalance();
//        sc.deposite(7500);
        sc.withdraw(100);

    }
}
