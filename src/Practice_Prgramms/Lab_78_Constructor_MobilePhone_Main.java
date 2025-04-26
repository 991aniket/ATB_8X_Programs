package Practice_Prgramms;

public class Lab_78_Constructor_MobilePhone_Main
{
    public static void main(String[] args)
    {
        Lab_77_Constructor_MobilePhone M1=new Lab_77_Constructor_MobilePhone("Moto","edge 50 Pro");
        Lab_77_Constructor_MobilePhone M2 = new Lab_77_Constructor_MobilePhone();
        Lab_77_Constructor_MobilePhone M3 = new Lab_77_Constructor_MobilePhone("S25",80000.00);
        Lab_77_Constructor_MobilePhone M4 = new Lab_77_Constructor_MobilePhone("Vivo","V20 Pro",45000.00);
        M1.display_Details();
        M2.display_Details();
        M3.display_Details();
        M4.display_Details();
    }

}
