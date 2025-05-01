package Practice_Prgramms;

public class Lab_80_Online_Shopping_Item_Main {
    public static void main(String[] args) {
        Lab_79_Online_Shopping_Item I1 = new Lab_79_Online_Shopping_Item("Sweat Tshirt",5,499);
        Lab_79_Online_Shopping_Item I2 = new Lab_79_Online_Shopping_Item(320,"T shirt");
        Lab_79_Online_Shopping_Item I3 = new Lab_79_Online_Shopping_Item(1600,"Jeans");
        I1.calculateTotalPrice();
        I1.displayItemInfo();
        I2.calculateTotalPrice();
        I2.displayItemInfo();
        I3.calculateTotalPrice();
        I3.displayItemInfo();
        System.out.println(I3.pricePerItem);
    }
}
