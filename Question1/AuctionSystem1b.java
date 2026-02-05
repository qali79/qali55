

package coursework1.auctionsystem1b;
import java.util.Scanner;

public class AuctionSystem1b {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //VEHICLE DETAILS 
        System.out.println("===== SK MOTORS VEHICLE DETAILS =====");

        System.out.print("Enter Vehicle Registration Number: ");
        String regNumber = input.nextLine();

        System.out.print("Enter Vehicle Cost: ");
        double vehicleCost = input.nextDouble();

        System.out.print("Enter Balance Left on Vehicle: ");
        double balanceLeft = input.nextDouble();

        // BIDDERS
        String highestBidder = "";
        double highestBid = 0;

        for (int i = 1; i <= 3; i++) {
            input.nextLine(); // clear buffer

            System.out.println("\nEnter details for Bidder " + i);

            System.out.print("Bidder Name: ");
            String bidderName = input.nextLine();

            System.out.print("Bid Amount: ");
            double bidAmount = input.nextDouble();

            if (bidAmount > highestBid) {
                highestBid = bidAmount;
                highestBidder = bidderName;
            }
        }

        //FINANCIAL DETAILS
        System.out.println("\n===== FINANCIAL DETAILS =====");

        System.out.print("Enter Total Deposits Made: ");
        double deposits = input.nextDouble();

        System.out.print("Enter Total Expenses Incurred: ");
        double expenses = input.nextDouble();

        // CALCULATIONS
        double totalIncome = highestBid + deposits;
        double totalCost = vehicleCost + expenses;
        double profitOrLoss = totalIncome - totalCost;

        //  OUTPUT
        System.out.println("\n===== AUCTION RESULT =====");
        System.out.println("Vehicle Registration: " + regNumber);
        System.out.println("Winning Bidder: " + highestBidder);
        System.out.println("Winning Bid Amount: " + highestBid);
        System.out.println("Balance Cleared: " + balanceLeft);

        if (profitOrLoss > 0) {
            System.out.println("PROFIT MADE: " + profitOrLoss);
        } else if (profitOrLoss < 0) {
            System.out.println("LOSS INCURRED: " + profitOrLoss);
        } else {
            System.out.println("NO PROFIT, NO LOSS");
        }

        System.out.println("\n===== TRANSACTION COMPLETE =====");
    }
}

