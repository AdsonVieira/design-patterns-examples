package behavioral.observer;

public class ECommerceX implements ObserverInterface {
    @Override
    public void update(Subject s) {
        System.out.println("Updating price product in ECommerceX...");
    }
}
