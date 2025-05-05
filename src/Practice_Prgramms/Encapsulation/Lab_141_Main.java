package Practice_Prgramms.Encapsulation;

public class Lab_141_Main
{
    public static void main(String[] args) {
        Lab_140_Atm a = new Lab_140_Atm();
        System.out.println(a.getBal("1234"));
        a.withdraw("1234",900.00);
    }
}
