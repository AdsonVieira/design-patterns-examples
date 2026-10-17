package structural.decorator;

import java.util.HashMap;
import java.util.Map;

public class CachingHttpClient extends HttpClientDecorator {
    private final Map<String, String> cache = new HashMap<>();

    public CachingHttpClient(HttpClient delegate) {
        super(delegate);
    }

    @Override
    public String get(String url) {
        if (cache.containsKey(url)) {
            System.out.println("[cache] hit: " + url);
            return cache.get(url);
        }
        System.out.println("[cache] miss: " + url);
        String response = delegate.get(url);
        cache.put(url, response);
        return response;
    }
}
