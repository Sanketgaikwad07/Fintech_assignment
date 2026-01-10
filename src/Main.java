import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //  create  data

        List<Transaction> transactions = new ArrayList<>();

        transactions.add(new Transaction("TXN1001", 250, "UPI",
                "Low", "Business Hours", false, 0));

        transactions.add(new Transaction("TXN1002", 75000, "Card",
                "High", "Non-Business Hours", true, 2));

        transactions.add(new Transaction("TXN1003", 1200, "Wallet",
                "Medium", "Business Hours", false, 1));

        transactions.add(new Transaction("TXN1004", 54000, "NetBanking",
                "Medium", "Non-Business Hours", true, 0));

        transactions.add(new Transaction("TXN1005", 300, "UPI",
                "High", "Non-Business Hours", false, 3));

        transactions.add(new Transaction("TXN1006", 9800, "Card",
                "Low", "Business Hours", false, 0));

        transactions.add(new Transaction("TXN1007", 150000, "NetBanking",
                "High", "Business Hours", true, 1));




        for (Transaction tn : transactions) {
            PriorityCalculator.calculate(tn);
        }


        //  Sort  scoer

        transactions.sort(
                Comparator.comparingInt(Transaction::getPriorityScore).reversed()
        );

        //  output

        System.out.println("\n  PRIORITIZED TRANSACTION LIST  \n");

        int rank = 1;
        for (Transaction ts : transactions) {
            System.out.println(rank++ + ". Transaction ID: " + ts.getTransactionId());
            System.out.println("   Amount: " + ts.getAmount());
            System.out.println("   Customer risk: " + ts.getCustomerRisk());
            System.out.println("   Time: " + ts.getTime());
            System.out.println("   New merchant: " + (ts.isNewMerchant() ? "Yes" : "No"));
            System.out.println("   Failure count: " + ts.getFailureCount());
            System.out.println("   Priority score: " + ts.getPriorityScore());
            System.out.println("   Reasons: ");
            for (String reason : ts.getReasons()) {
                System.out.println("   - " + reason);
            }
            System.out.println("--  --  --  --  --  --  ");
        }
    }
}
