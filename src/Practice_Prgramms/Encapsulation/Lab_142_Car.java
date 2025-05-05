package Practice_Prgramms.Encapsulation;

public class Lab_142_Car
{
    private boolean engineOn=false;

    public void startCar()
    {
        engineOn=false;
        System.out.println("Car started ");
    }
    public void drive()
    {
        if (engineOn)
        {
            System.out.println("Car is moving");
        }
        else
        {
            System.out.println("Start the car first");
        }
    }


}
