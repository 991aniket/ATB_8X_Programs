package Practice_Prgramms;

public class Lab_80_Hotel_Room
{
    int roomNumber;
    String roomType;
    boolean isBooked;

    Lab_80_Hotel_Room(int roomNumber,String roomType,boolean isBooked)
    {
        this.roomNumber=roomNumber;
        this.roomType=roomType;
        this.isBooked=isBooked;
    }
    void bookRoom()
    {
        if (!isBooked)
        {
            isBooked=true;
            System.out.println("Room "+roomNumber+" booked Successfully !");
//            System.out.println("_____________________________________");
        }
        else
        {
            System.out.println("Room "+ roomNumber+ " is already booked. ");
        }
    }
    void vacateRoom()
    {
        if (isBooked)
        {
            isBooked=false;
            System.out.println("Room "+ roomNumber+" vacated Successfully !");
        }
        else
        {
            System.out.println("Room "+ roomNumber+" is already Vacant.");
        }
    }

    void displayRoomDetails()
    {
        System.out.println("Room number : "+roomNumber);
        System.out.println("Room type : "+roomType);
        System.out.println("Booking Status : "+(isBooked?"Booked":"vacant"));
        System.out.println("_____________________________________");
    }

}
