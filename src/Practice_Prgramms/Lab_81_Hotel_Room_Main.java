package Practice_Prgramms;

public class Lab_81_Hotel_Room_Main
{
    public static void main(String[] args)
    {
        Lab_80_Hotel_Room r1 = new Lab_80_Hotel_Room(102,"Single",true);
        r1.bookRoom();
        r1.vacateRoom();
        r1.displayRoomDetails();
        Lab_80_Hotel_Room r2 = new Lab_80_Hotel_Room(103,"Single",false);
        r2.bookRoom();
//        r2.vacateRoom();
        r2.displayRoomDetails();
    }
}
