package Practice_Prgramms.Hierarchical_Inheritance;

import java.awt.*;

public class Lab_119_Main
{
    public static void main(String[] args)
    {
        Lab_115_Shape S = new Lab_115_Shape();
        S.draw();
        System.out.println("-----------------------");

        Lab_116_Circle C = new Lab_116_Circle();
        C.calculateArea();
        C.draw();
        System.out.println("-----------------------");

        Lab_117_Rectangle R = new Lab_117_Rectangle();
        R.calculateArea();
        R.draw();
        System.out.println("-----------------------");

        Lab_118_Triangle T = new Lab_118_Triangle();
        T.calculateArea();
        T.draw();
        System.out.println("-----------------------");
    }
}
