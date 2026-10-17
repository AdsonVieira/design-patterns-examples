package structural.decorator;

public class LoggingMetricsHttpClient extends HttpClientDecorator {
    public LoggingMetricsHttpClient(HttpClient delegate) {
        super(delegate);
    }

    @Override
    public String get(String url) {
        long start = System.nanoTime();
        String response = delegate.get(url);
        long elapsedMs = (System.nanoTime() - start) / 1_000_000;
        System.out.println("[log+métrica] " + url + " em " + elapsedMs + " ms");
        return response;
    }
}
