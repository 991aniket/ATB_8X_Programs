package Practice_Prgramms.Polymorphism.Method_Overriding;

public class Lab_134_Main
{
    public static void main(String[] args) {
        Lab_132_Animal obj = new Lab_132_Animal();
        obj.sound();
        Lab_133_Dog d = new Lab_133_Dog();
        d.sound();
        Lab_132_Animal a = new Lab_133_Dog();
        a.sound();
    }
}
