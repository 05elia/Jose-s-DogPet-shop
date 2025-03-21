public class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public void processPayment() { 
        System.out.println("Processing general payment of $" + amount);
    }

    // OVERLOADING: metode dengan parameter tambahan
    public void processPayment(String note) { 
        System.out.println("Processing payment of $" + amount + " with note: " + note);
    }
}
