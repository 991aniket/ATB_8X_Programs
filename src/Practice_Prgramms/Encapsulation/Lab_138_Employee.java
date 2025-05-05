package Practice_Prgramms.Encapsulation;

public class Lab_138_Employee
{
    //Private data members
    private String name;
    private int age;

    //Getter & setter methods


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        if (age>0) {
            this.age = age;
        }
    }
}
