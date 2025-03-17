package Practice_Prgramms;

public class Lab_30_Switch {
    public static void main(String[] args) {
    // browser to open for automation testing
        String browser = "Chrome";
        switch (browser){
            default:
                System.out.println("Browser does not exists");
                break;
            case "Microsoftedge":
                System.out.println("Edge will open");
                break;
            case "safari":
                System.out.println("Safari will open");
                break;
            case "opera mini":
                System.out.println("opera mini will open ");
                break;
            case "Chrome":
                System.out.println("Chrome will open ");
                break;

        }
    }
}
