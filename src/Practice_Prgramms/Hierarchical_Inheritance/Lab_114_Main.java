package Practice_Prgramms.Hierarchical_Inheritance;

public class Lab_114_Main
{
//          Parent
//         /   |   \
//    Child1 Child2 Child3\


    public static void main(String[] args) {
        Lab_110_Animal A = new Lab_110_Animal();
        A.eat();
        System.out.println("-----------------------");

        Lab_111_Dog D = new Lab_111_Dog();
        D.bark();
        D.eat();
        System.out.println("-----------------------");

        Lab_112_Cat C = new Lab_112_Cat();
        C.meow();
        C.eat();
        System.out.println("-----------------------");

        Lab_113_Cow CW = new Lab_113_Cow();
        CW.eat();
        CW.moo();
        System.out.println("-----------------------");
    }
}
