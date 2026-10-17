package creational.factory;

public class ChannelFactory {
    public static Channel createTCPChannel() {
        return new TCPChannel();
    }

    public static Channel createUDPChannel() {
        return new UDPChannel();
    }
}
