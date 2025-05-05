package Practice_Prgramms.Encapsulation;

public class Lab_144_Product
{
    private String name;
    private double price;
    private int stock;

    //constructor
    public Lab_144_Product(String name,double price,int stock)
    {
        this.name=name;
        this.price=price;
        this.stock=stock;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public boolean reduceStock(int quantity)
    {
        if (quantity>=0&&quantity<=stock)
        {
            stock -=quantity;
            System.out.println(stock);
            return  true;
        }
        else {
            return false;
        }
    }
}
