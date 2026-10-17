package behavioral.observer;

public class Product extends Subject {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void updatePrice(double price) {
        this.price = price;
        this.notifyObservers();
    }
}
