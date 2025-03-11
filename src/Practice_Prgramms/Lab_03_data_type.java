package Practice_Prgramms;

public class Lab_03_data_type {
    public static void main(String[] args)
    {
        // Primitive Data Type
        byte a=127;  //8 bits , 1 byte
        short b=150; // 16 bits , 2 byte
        int c=1000;  //32 bits, 4 byte
        long d=9087654321l; //64 bits, 8 byte
        long e=9087654322L;  // 64 bits , 8 byte
        char grade='A'; // 'A', b, c , e, d, el -> ASCII value - int - assigned.
        // 16 Bits, 2 Byte
        float f=3.14f; //
        float f1=3.14F; // // 32 Bits, 4 Byte
        double pie= 3.1423; // 64 Bites, 8 Bytes

        // Non primitive Data Types (user defined)
        String name ="Aniket Pawar";  // String - bunch of char(collection of chars)
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(grade);
        System.out.println(f);
        System.out.println(f1);
        System.out.println(pie);
        System.out.println(name);

    }
}
