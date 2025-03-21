public class Ewallet extends Payment {
    private String provider;

    public Ewallet(double amount, String provider) {
        super(amount);
        this.provider = provider;
    }

    @Override
    public void processPayment() { 
        System.out.println("Processing E-Wallet payment via " + provider);
    }

    // OVERLOADING: proses pembayaran dengan promo code
    public void processPayment(String promoCode, double discount) {
        double finalAmount = amount - discount;
        System.out.println("Processing E-Wallet payment via " + provider + " with promo: " + promoCode);
        System.out.println("Final amount after discount: $" + finalAmount);
    }
}
