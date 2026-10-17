package creational.factory;

public class UDPChannel implements Channel {
    public UDPChannel() {
        this.showConnection();
    }
    @Override
    public void showConnection() {
        System.out.println("Connected UDP");
    }
}
