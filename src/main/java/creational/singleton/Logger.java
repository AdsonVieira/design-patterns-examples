package creational.singleton;

public class Logger {
    private static Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            return new Logger();
        }
        return instance;
    }

    public void getInstanceInfo() {
        System.out.println(this.hashCode());
    }
}
