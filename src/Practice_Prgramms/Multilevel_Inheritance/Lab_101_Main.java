package Practice_Prgramms.Multilevel_Inheritance;

public class Lab_101_Main {
    public static void main(String[] args) {
        Lab_99_Car C = new Lab_99_Car();
        C.drive();
        C.start();
        System.out.println("-----------------------");

        Lab_100_ElectriCar E = new Lab_100_ElectriCar();
        E.charge();
        E.start();
        E.drive();
        System.out.println("-----------------------");

        Lab_98_Vehicle V = new Lab_98_Vehicle();
        V.start();
        System.out.println("-----------------------");
    }
}
