public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        ATM atm = new ATM();
        Customer customer = new Customer();
        DebitCard card = new DebitCard();
        SavingsAccount savings = new SavingsAccount("SAV123");
        Transfer transfer = new Transfer();
        Withdrawal withdrawal = new Withdrawal();
        PinGeneration pinGen = new PinGeneration();

        bank.manages();
        atm.transaction();
        customer.owns();
        card.accessTo();
        savings.checkBalance();
        withdrawal.withdraw();
        transfer.transfer();
        pinGen.pinGenerate();
    }
}

