package Practice_Prgramms;

public class Lab_59_Methods {
    public static void main(String[] args) {
        // Methods are block of code design to perform specific task
        // Syntax of method
        // accessModifier Modifier returnType methodName (formal argument)
        //{
        // Method Block
        //}
        //1. Pre-built - Math.max() - Java guys
        // 2. User created / defined
        //components of method
        // a-> Define
        // b-> Call
        //user define methods should always call in main method only
        //we can call 'n' no. of times
        greet();
        greet();
    for (int i=1;i<5;i++)
    {
       greet();

    }

    }
    public static void greet()
    {
        System.out.println("Hii");
    }
}
