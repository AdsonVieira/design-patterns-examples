package structural.decorator;

public class Decorator {
    public static void main(String[] args) {
        HttpClient client = new LoggingMetricsHttpClient(
                new CachingHttpClient(new BasicHttpClient()));

        String url = "/users/1";
        System.out.println("--- 1ª chamada ---");
        client.get(url);
        System.out.println("--- 2ª chamada (mesma URL) ---");
        client.get(url);
    }
}
