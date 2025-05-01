package Practice_Prgramms.Multilevel_Inheritance;

public class Lab_109_Main
{
    public static void main(String[] args)
    {
        Lab_106_Appliance A = new Lab_106_Appliance();
        A.powerOn();
        System.out.println("-----------------------");

        Lab_107_WashingMachine W = new Lab_107_WashingMachine();
        W.wash();
        W.powerOn();
        System.out.println("-----------------------");

        Lab_108_SmartWasher S = new Lab_108_SmartWasher();
        S.connectWifi();
        S.powerOn();
        S.wash();
        System.out.println("-----------------------");
    }
}
