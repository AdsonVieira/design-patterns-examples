package structural.facade;

public class Facade {
    public static void main(String[] args) {
        DB db = new DB();
        System.out.println(db.connect());
    }
}
