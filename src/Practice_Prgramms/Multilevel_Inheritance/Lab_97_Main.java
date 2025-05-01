package Practice_Prgramms.Multilevel_Inheritance;

public class Lab_97_Main
{
    public static void main(String[] args) {
        Lab_96_Dog D = new Lab_96_Dog();
        D.breathe();
        D.bark();
        D.walk();
        System.out.println("-----------------------");

        Lab_95_Mammal M = new Lab_95_Mammal();
        M.breathe();
        M.walk();
        System.out.println("-----------------------");

        Lab_94_Animal A = new Lab_94_Animal();
        A.breathe();
        System.out.println("-----------------------");


    }
}
