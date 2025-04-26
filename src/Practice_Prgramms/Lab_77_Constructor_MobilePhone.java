package Practice_Prgramms;

public class Lab_77_Constructor_MobilePhone
{
    String brand;
    String model;
    double price;

    Lab_77_Constructor_MobilePhone(String brand,String model)
    {
        this.brand=brand;
        this.model=model;
        this.price=27000;

    }
    Lab_77_Constructor_MobilePhone()
    {
        this.brand="Apple";
        this.model="Iphone 16";
        this.price=63000;
    }
    Lab_77_Constructor_MobilePhone(String model,Double price)
    {
        this.model=model;
        this.price=price;
        this.brand="Samsung";
    }
    Lab_77_Constructor_MobilePhone(String brand,String model,Double price)
    {
        this.model=model;
        this.price=price;
        this.brand=brand;
    }
    void display_Details()
    {
        System.out.println(model);
        System.out.println(brand);
        System.out.println(price);
        System.out.println("___________________________________________");
    }

}
