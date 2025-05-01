package Practice_Prgramms;

public class Lab_79_Online_Shopping_Item
{
    String itemName;
    int qty;
    double pricePerItem;

    Lab_79_Online_Shopping_Item(String itemName,int qty,double pricePerItem)
    {
        this.itemName=itemName;
        this.pricePerItem=pricePerItem;
        this.qty=qty;
    }
    Lab_79_Online_Shopping_Item(double pricePerItem,String itemName)
    {
        this.itemName=itemName;
        this.pricePerItem=pricePerItem;
        this.qty=5;
    }
//    Lab_79_Online_Shopping_Item(double pricePerItem)
//    {
//        this.qty=10;
//        this.itemName="Jeans";
//    }
    void calculateTotalPrice()
    {
        double totalAmount=qty*pricePerItem;
        System.out.println(totalAmount);
    }
    void displayItemInfo()
    {
        System.out.print(itemName + " "+ qty +"*"+ pricePerItem+ " = ");
        calculateTotalPrice();

    }
}
