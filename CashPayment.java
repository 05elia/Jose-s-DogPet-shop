public class CashPayment extends Payment {

    public CashPayment(int amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing cash payment of $" + amount);
    }

    // OVERLOADING: Menyertakan nama kasir yang menerima pembayaran
    public void processPayment(String cashierName) {
        System.out.println("Processing cash payment of $" + amount + " received by cashier: " + cashierName);
    }
}
