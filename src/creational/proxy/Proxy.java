package creational.proxy;

public class Proxy {
    public static void main(String[] args) {
        BookSearchProxy bookSearchProxy = new BookSearchProxy();

        System.out.println("Get from cache example");
        System.out.println(bookSearchProxy.get("123"));

        System.out.println("Get from database example");
        System.out.println(bookSearchProxy.get("112"));
    }
}
