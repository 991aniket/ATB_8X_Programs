package Practice_Prgramms.Polymorphism.Method_Overriding;

public class Lab_137_Main
{
    public static void main(String[] args) {
        Lab_135_Vehicle V = new Lab_135_Vehicle();
        V.run();
        Lab_136_Bike b = new Lab_136_Bike();
        b.run();
        Lab_135_Vehicle vb = new Lab_136_Bike();
        vb.run();
    }
}
