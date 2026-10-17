package creational.factory;

public class Factory {
    public static void main(String[] args) {
        ClientTCP clientTCP = new ClientTCP();
        ClientUDP clientUDP = new ClientUDP();
    }
}
