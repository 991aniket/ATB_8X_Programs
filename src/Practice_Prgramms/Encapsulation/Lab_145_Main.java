package Practice_Prgramms.Encapsulation;

public class Lab_145_Main
{
    public static void main(String[] args) {
        Lab_144_Product p = new Lab_144_Product("test",900.00,100);
        System.out.println(p.getName());
        System.out.println(p.getPrice());
        System.out.println(p.getStock());

        p.reduceStock(21);

    }
}
