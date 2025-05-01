package Practice_Prgramms.Hierarchical_Inheritance;

public class Lab_123_Main
{
    public static void main(String[] args)
    {
            Lab_120_Vehicle V = new Lab_120_Vehicle();
            V.startEngine();
            System.out.println("-----------------------");

            Lab_121_Bike B = new Lab_121_Bike();
            B.kickStart();
            B.startEngine();
            System.out.println("-----------------------");

            Lab_122_Car C = new Lab_122_Car();
            C.openTrunk();
            C.startEngine();
            System.out.println("-----------------------");
    }
}
