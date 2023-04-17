package behavioral.observer;

public class Observer {
    public static void main(String[] args) {
        Product product = new Product("Computer", 100);
        product.addObserver(new ECommerceX());
        product.addObserver(new ECommerceY());

        product.updatePrice(1000);
    }
}
