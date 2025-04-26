package Practice_Prgramms;

public class Lab_75_Constructor_Pizza_Price {

    String size;
    String toppings;
    double price;

    Lab_75_Constructor_Pizza_Price(String size, String toppings)
    {
        this.size=size;
        this.toppings=toppings;
        this.price=120;
    }
    Lab_75_Constructor_Pizza_Price(String size, String toppings, double price)
    {
        this.size=size;
        this.toppings=toppings;
        this.price=price;
    }
    void display_Order()
    {
        System.out.println("Pizza Size - "+size);
        System.out.println("Toppings on Pizaa - "+toppings);
        System.out.println("Price: ₹" + price);
    }


}
