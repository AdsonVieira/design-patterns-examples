package structural.decorator;

public abstract class ChannelDecorator implements Channel {
    protected Channel channel;

    public ChannelDecorator(Channel channel) {
        this.channel = channel;
    }

    public void showConnection() {
        this.channel.showConnection();
    }
}
