package Practice_Prgramms.Single_Inheritane;

public class Lab_87_Main
{
    public static void main(String[] args)
    {
        Lab_85_Book  B = new Lab_85_Book();
        B.displayInfo();
        System.out.println("-----------------------");
        Lab_86_Novel N= new Lab_86_Novel();
        N.displayNovel();
        N.displayInfo();
    }
}
