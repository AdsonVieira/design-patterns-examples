package behavioral.command;

public class Light {
    private boolean on;

    public void turnOn() {
        on = true;
        System.out.println("Luz ligada");
    }

    public void turnOff() {
        on = false;
        System.out.println("Luz desligada");
    }

    public boolean isOn() {
        return on;
    }
}
