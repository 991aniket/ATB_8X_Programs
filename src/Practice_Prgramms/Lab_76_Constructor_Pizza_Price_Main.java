package Practice_Prgramms;

public class Lab_76_Constructor_Pizza_Price_Main {
    public static void main(String[] args)
    {
        Lab_75_Constructor_Pizza_Price p1=new Lab_75_Constructor_Pizza_Price("Large","Pepperoni and Mushrooms");
        Lab_75_Constructor_Pizza_Price p2=new Lab_75_Constructor_Pizza_Price("Small","Cheese and Olives");
        Lab_75_Constructor_Pizza_Price p3=new Lab_75_Constructor_Pizza_Price("Large","Pepperoni and Mushrooms",210);
        p1.display_Order();
        p2.display_Order();
        p3.display_Order();
    }
}
