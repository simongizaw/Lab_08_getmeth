import java.util.Scanner;

public class RegEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String SSN = "";
        String UCm = "";
        String Menu = "";
        SSN=SafeInput.getRegExString(in,"Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("\nYour SSN is:"+SSN);
        UCm=SafeInput.getRegExString(in,"Enter your UC M number", "(M|m)\\d{5}");
        System.out.println("\nYour UC M number is:" +UCm);
        Menu=SafeInput.getRegExString(in,"Would you like to Open, Save, View, or Quit", "[OoSsVvQq]");
        switch(Menu){
            case "O":
            case"o":
                System.out.println("Opening...");
                break;
            case "s":
            case "S":
                System.out.println("Saving...");
                break;
            case "v":
            case "V":
                System.out.println("Viewing...");
                break;
            case "q":
            case "Q":
                System.out.println("Quitting...");
                break;
        }
    }
}