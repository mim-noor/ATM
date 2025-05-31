public class CurrentAccount extends Account {
    private String accountID;

    public CurrentAccount(String accountID) {
        this.accountID = accountID;
        this.type = "Current";
    }
}
