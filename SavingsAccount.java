public class SavingsAccount extends Account {
    private String accountID;

    public SavingsAccount(String accountID) {
        this.accountID = accountID;
        this.type = "Savings";
    }
}

