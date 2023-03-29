import java.util.Scanner;

public class ElectricityBillingSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the customer name: ");
        String name = input.nextLine();
        System.out.print("Enter the previous month's reading: ");
        int prevReading = input.nextInt();
        System.out.print("Enter the current month's reading: ");
        int currReading = input.nextInt();

        int unitsConsumed = currReading - prevReading;

        double charges;
        if (unitsConsumed <= 100) {
            charges = unitsConsumed * 3.0;
        } else if (unitsConsumed <= 200) {
            charges = 100 * 3.0 + (unitsConsumed - 100) * 4.0;
        } else if (unitsConsumed <= 300) {
            charges = 100 * 3.0 + 100 * 4.0 + (unitsConsumed - 200) * 5.0;
        } else {
            charges = 100 * 3.0 + 100 * 4.0 + 100 * 5.0 + (unitsConsumed - 300) * 6.0;
        }

        System.out.println("\nCustomer Name: " + name);
        System.out.println("Units consumed: " + unitsConsumed);
        System.out.println("Charge per unit: Rs. " + charges/unitsConsumed);
        System.out.println("Total Charges: Rs. " + charges);
    }

}
