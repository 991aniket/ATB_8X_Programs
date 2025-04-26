package Practice_Prgramms;

public class Lab_73_Constructor_Pizza {
    String size;
    String toppings;
    Lab_73_Constructor_Pizza (String size, String toppings)
    {
        this.size=size;
        this.toppings=toppings;
    }
    void displayPizza()
    {
        System.out.println("Pizza Size - "+size);
        System.out.println("Toppings on Pizaa - "+toppings);
    }

}
