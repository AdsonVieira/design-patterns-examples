package behavioral.observer;

public class ECommerceY implements ObserverInterface {
    @Override
    public void update(Subject s) {
        System.out.println("Updating price product in ECommerceY...");
    }
}
