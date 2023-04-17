package structural.adapter;

public class AdapterProjectorSamsung {
    public boolean turnOn() {
        ProjectorSamsung projectorSamsung = new ProjectorSamsung();
        return projectorSamsung.toConnect();
    }
}
