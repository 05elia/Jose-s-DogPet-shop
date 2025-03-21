import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderID;
    private int userID;
    private List<Dog> dogs;
    private float totalPrice;
    private String status;

    public Order(int orderID, int userID) {
        this.orderID = orderID;
        this.userID = userID;
        this.dogs = new ArrayList<>();
    }
    public void addDogToOrder(Dog dog) {
        dogs.add(dog);
        System.out.println("Added 1 dog to order.");
    }
    
    public void addDogToOrder(Dog dog, int quantity) {
        for (int i = 0; i < quantity; i++) {
            dogs.add(dog);
        }
        System.out.println("Added " + quantity + " dogs to order.");
    }
    
}