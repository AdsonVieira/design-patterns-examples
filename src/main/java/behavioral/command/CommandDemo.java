package behavioral.command;

public class CommandDemo {
    public static void main(String[] args) {
        Light light = new Light();
        RemoteControl remote = new RemoteControl();

        remote.setCommand(new LightOnCommand(light));
        remote.pressButton();

        remote.setCommand(new LightOffCommand(light));
        remote.pressButton();

        remote.setCommand(new LightOnCommand(light));
        remote.pressButton();
        remote.pressUndo();
    }
}
