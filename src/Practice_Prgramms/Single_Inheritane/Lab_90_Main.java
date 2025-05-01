package Practice_Prgramms.Single_Inheritane;

public class Lab_90_Main
{
    public static void main(String[] args) {
        Lab_88_Employee E = new Lab_88_Employee();
        E.work();
        System.out.println("-----------------------");
        Lab_89_Manager M = new Lab_89_Manager();
        M.manage();
        M.work();
    }
}
