import java.util.Scanner;

public class PizzaBillingSystem {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int TotalBill = 0;
        String size;

        while (true) {
            System.out.print("Enter pizza size (small/medium/large): ");
            size = S.nextLine();
            if (size.equals("small")) {
                TotalBill = 100;
                break;
            } else if (size.equals("medium")) {
                TotalBill = 200;
                break;
            } else if (size.equals("large")) {
                TotalBill = 300;
                break;
            } else {
                System.out.println("Invalid size entered. Please enter small, medium, or large.");
            }
        }


        // Validate pepperoni input with a simple loop
        String pepperoni;
        while (true) {
            System.out.print("Do you want pepperoni? (yes/no): ");
            pepperoni = S.nextLine();
            if (pepperoni.equals("yes") || pepperoni.equals("no")) {
                break;
            }
            System.out.println("Invalid input. Please enter only 'yes' or 'no'.");
        }
        if (pepperoni.equals("yes")) {
            if (size.equals("small")) {
                TotalBill += 30;
            } else {
                TotalBill += 50;
            }
        }

        // Validate extra cheese input with a simple loop
        String cheese;
        while (true) {
            System.out.print("Do you want extra cheese? (yes/no): ");
            cheese = S.nextLine();
            if (cheese.equals("yes") || cheese.equals("no")) {
                break;
            }
            System.out.println("Invalid input. Please enter only 'yes' or 'no'.");
        }
        if (cheese.equals("yes")) {
            TotalBill+= 20;
        }

        System.out.println("Your final bill is: " + TotalBill + " rupees");

    }
}
