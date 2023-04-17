package structural.decorator;

public class TCPChannel implements Channel {
    public TCPChannel() {
        this.showConnection();
    }

    @Override
    public void showConnection() {
        System.out.println("Connected TCP");
    }
}
