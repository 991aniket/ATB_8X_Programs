package Practice_Prgramms.Single_Inheritane;

public class Lab_93_Main
{
    public static void main(String[] args)
    {
        Lab_92_Circle C = new Lab_92_Circle();
        C.calculateArea();
        C.draw();
        System.out.println("-----------------------");
        Lab_91_Shape S = new Lab_91_Shape();
        S.draw();
    }
}
