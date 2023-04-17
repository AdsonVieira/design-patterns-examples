package structural.decorator;

public class ZipConnectionsInfoDecorator extends ChannelDecorator {
    public ZipConnectionsInfoDecorator(Channel channel) {
        super(channel);
    }

    @Override
    public void showConnection() {
        this.zipConnectionsInfo();
    }

    private void zipConnectionsInfo() {
        System.out.println("zip information's example...");
    }
}
