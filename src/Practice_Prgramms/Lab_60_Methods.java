package Practice_Prgramms;

public class Lab_60_Methods {
    public static void main(String[] args)
    {
        type_1();
        type_2();
        String name=type_2();
        System.out.println(name);
        type_3("Aniket Pawar",25,"Male");
        int result=  type_4(12,10);
        System.out.println(result);
//        type_4(12,14);
    }
    public  static void type_1()
    {
        System.out.println("Type 1 - No Argument & No return type");
        System.out.println("nothing to print");
    }
    public static String type_2()
    {
        System.out.println("Type 2 - No Argument & with return type");
        return "Aniket";
    }
    public  static  void type_3(String name,int age,String gender)
    // we can pass number of arguments
    //different types arguments
    //
    {
        System.out.println("Type 3 - With Argument & no return type");
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
    }
    public static int type_4(int a,int b)
    {
        System.out.println("Type 4 - With Argument & with return type");
        return a*b;
    }
}
