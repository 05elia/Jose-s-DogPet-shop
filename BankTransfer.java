public class BankTransfer extends Payment {
    private String bankName;

    public BankTransfer(double amount, String bankName) {
        super(amount);
        this.bankName = bankName;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing bank transfer via " + bankName);
    }
}