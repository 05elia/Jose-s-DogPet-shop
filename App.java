import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Input data anjing dari pengguna
        System.out.print("Breed: ");
        String breed = scanner.nextLine();
        
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Tambahkan ini untuk menghindari bug input buffer
        
        System.out.print("Gender: ");
        String gender = scanner.nextLine(); // Simpan sebagai String
        
        int dogID = new Random().nextInt(9000) + 1000; // Generate ID otomatis
        double price = age * 25000; // buat mengkalkulasi harga berdasarkan umur anjing-nya 
        
        Dog selectedDog = new Dog(dogID, breed, age, gender, price);
        selectedDog.getDetails();
        
        // Menampilkan opsi metode pembayaran
        System.out.println("\n========Pilih metode pembayaran:========");
        System.out.println("1. E-Wallet");
        System.out.println("2. Bank Transfer");
        System.out.println("3. Cash");
        System.out.print("Masukkan pilihan (1-3): ");
        int PaymentChoice = scanner.nextInt();
        scanner.nextLine(); // Tambahkan ini untuk menghindari bug input buffer
        System.out.println("\n========================================");

        Payment payment = null;

        switch (PaymentChoice) {
            case 1:
                payment = new Ewallet(10000000, "Dana");
                break;
            case 2:
                payment = new BankTransfer(10000000, "Mandiri");
                break;
            case 3:
                payment = new CashPayment(10000000);
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                System.exit(0);
        }

        // Memproses pembayaran berdasarkan pilihan pengguna
        if (payment instanceof CashPayment) {
            System.out.print("Masukkan nama kasir: ");
            String cashierName = scanner.nextLine();
            ((CashPayment) payment).processPayment(cashierName); // Panggil versi overloading
        } else {
            payment.processPayment();
        }

        // Menampilkan informasi anjing yang dibeli
        System.out.println("\n========Informasi Anjing yang Dibeli:========");
        selectedDog.getDetails();
        System.out.println("Jaga dan rawat dia dengan baik. Anjing adalah sahabat setia manusia! :)");
        System.out.println("=============================================");

        scanner.close();
    }
}
