public class CashPayment extends Payment {

    public CashPayment(int amount) { // Tetap pakai int di sini
        super((double) amount); // Konversi ke double saat memanggil konstruktor superclass
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
