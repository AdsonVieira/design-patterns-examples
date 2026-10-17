package creational.factory;

public class ClientTCP {
    public ClientTCP() {
        Channel channel = ChannelFactory.createTCPChannel();
    }
}
