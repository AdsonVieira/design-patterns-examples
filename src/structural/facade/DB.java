package structural.facade;

public class DB {
    public boolean connect() {
        return new Hibernate().complexInstructionsToAccessDatabase();
    }
}
