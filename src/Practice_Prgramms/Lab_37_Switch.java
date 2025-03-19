package Practice_Prgramms;

public class Lab_37_Switch {
    public static void main(String[] args) {
        // char c = 'a' -> Vowel or consonant
        // vowel ->  a, e, i o, u
        char ch = 'a';
        System.out.println("By using Switch");
        switch (ch)
        {
            case 'a','i','e','o','u'-> System.out.println("It is a vowel");
            default -> System.out.println("It is not a vowel");
        }

        // by using If else
        System.out.println("By using if else");

        if (ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println("It is a Vowel");
        }
        else {
            System.out.println("It is Not a vowel");
        }
    }
}
