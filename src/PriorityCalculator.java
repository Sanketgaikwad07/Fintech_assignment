import java.util.ArrayList;
import java.util.List;

public class PriorityCalculator {

    public static void calculate(Transaction tx) {

        int score = 0;
        List<String> reasons = new ArrayList<>();

        // Amount  scoring
        if (tx.getAmount() > 100000) {
            score += 40;
            reasons.add("Very high amount (>100000)");
        } else if (tx.getAmount() > 50000) {
            score += 30;
            reasons.add("High amount (50000-100000)");
        } else if (tx.getAmount() > 10000) {
            score += 20;
            reasons.add("Moderate amount (10000-50000)");
        } else {
            score += 5;
            reasons.add("Low amount (<10000)");
        }

        //  customer risk profile
        switch (tx.getCustomerRisk()) {
            case "High":
                score += 25;
                reasons.add("High risk customer");
                break;
            case "Medium":
                score += 15;
                reasons.add("Medium risk customer");
                break;
            default:
                score += 5;
                reasons.add("Low risk customer");
        }

        //  time based risk
        if ("Non-Business Hours".equals(tx.getTime())) {
            score += 10;
            reasons.add("Transaction during non-business hours");
        }


        if (tx.isNewMerchant()) {
            score += 15;
            reasons.add("New merchant");
        }

        // 5. Failure history
        if (tx.getFailureCount() > 0) {
            score += tx.getFailureCount() * 5;
            reasons.add(tx.getFailureCount() + " previous failures");
        }

        tx.setPriorityScore(score);
        tx.setReasons(reasons);
    }
}
