package Practice_Prgramms.Multilevel_Inheritance;

public class Lab_105_Main
{
    public static void main(String[] args)
    {
        Lab_102_Person P = new Lab_102_Person();
        P.showName();
        System.out.println("-----------------------");

        Lab_103_Employee E = new Lab_103_Employee();
        E.showSalary();
        E.showName();
        System.out.println("-----------------------");

        Lab_104_Manager M = new Lab_104_Manager();
        M.showName();
        M.showSalary();
        M.manageTeam();
        System.out.println("-----------------------");
    }
}
