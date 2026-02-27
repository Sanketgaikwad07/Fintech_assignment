import java.util.List;

public class Transaction {

    private String transactionId;
    private int amount;
    private String transactionType;
    private String customerRisk;
    private String time;
    private boolean newMerchant;
    private int failureCount;

    private int priorityScore;
    private List<String> reasons;

    public Transaction(String transactionId, int amount,
                       String transactionType,
                       String customerRisk,
                       String time,
                       boolean newMerchant,
                       int failureCount) {

        this.transactionId = transactionId;
        this.amount = amount;
        this.transactionType = transactionType;
        this.customerRisk = customerRisk;
        this.time = time;
        this.newMerchant = newMerchant;
        this.failureCount = failureCount;
    }


    public String getTransactionId() { return transactionId; }
    public int getAmount() { return amount; }
    public String getCustomerRisk() { return customerRisk; }
    public String getTime() { return time; }
    public boolean isNewMerchant() { return newMerchant; }
    public int getFailureCount() { return failureCount; }

    public int getPriorityScore() { return priorityScore; }
    public void setPriorityScore(int priorityScore) { this.priorityScore = priorityScore; }

    public List<String> getReasons() { return reasons; }
    public void setReasons(List<String> reasons) { this.reasons = reasons; }
}
