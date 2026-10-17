package creational.factory;

public class ClientUDP {
    public ClientUDP() {
        Channel channel = ChannelFactory.createUDPChannel();
    }
}
