package Practice_Prgramms;

public class Lab_20_Type_Casting {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
        //short s = phone_no; // Narrowing - Implicit - JVM // Invalid
        short s1 = (short)phone_no; // Narrowing - Explicit - Loss // Invalid
        System.out.println(s1);
    }
}
