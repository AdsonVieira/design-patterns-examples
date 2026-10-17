package structural.decorator;

public abstract class HttpClientDecorator implements HttpClient {
    protected final HttpClient delegate;

    protected HttpClientDecorator(HttpClient delegate) {
        this.delegate = delegate;
    }

    @Override
    public String get(String url) {
        return delegate.get(url);
    }
}
