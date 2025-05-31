public class Transfer {
    private double amount;
    private String accountID;

    public void transfer() {
        System.out.println("Transferring " + amount + " to account: " + accountID);
    }
}

