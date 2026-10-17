package structural.decorator;

public class BasicHttpClient implements HttpClient {
    @Override
    public String get(String url) {
        System.out.println("[base] chamando API: " + url);
        return "resposta-de-" + url;
    }
}
