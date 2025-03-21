public class Dog {
    private int dogID;
    private String breed;
    private int age;
    private String gender; // Ubah dari char ke String
    private double price; // Pastikan tipe data price sesuai

    // Constructor
    public Dog(int dogID, String breed, int age, String gender, double price) {
        this.dogID = dogID;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.price = price;
    }

    public void getDetails() {
        System.out.println("ID: " + dogID + ", Breed: " + breed + ", Gender: " + gender + 
                           ", Age: " + age + ", Price: " + price);
    }

    public double getPrice() {
        return price;
    }
}
