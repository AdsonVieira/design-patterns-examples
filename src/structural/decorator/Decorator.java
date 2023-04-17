package structural.decorator;

public class Decorator {
    public static void main(String[] args) {
        TCPChannel channel = new TCPChannel();
        Channel zipConnectionsInfoDecorator = new ZipConnectionsInfoDecorator(channel);
        zipConnectionsInfoDecorator.showConnection();
    }
}
