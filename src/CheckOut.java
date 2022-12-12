import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cost = 0;
        boolean Continue = true;
        double totalCost = 0;
        do {
            cost = SafeInput.getRangedDouble(in, "Enter item cost: ", 0.50, 9.99);
            Continue = SafeInput.getYNConfirm(in, "Enter another item? [Y/N]");
            totalCost = cost + totalCost;
        } while (Continue == true);
        System.out.println("\nYour total cost is " +totalCost);
    }
}

