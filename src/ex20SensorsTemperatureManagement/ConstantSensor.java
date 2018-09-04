package ex20SensorsTemperatureManagement;

public class ConstantSensor implements Sensor{

    private String state;
    private final int temperature;

    public ConstantSensor(int temperature) {
        this.state = "on";
        this.temperature = temperature;
    }

    @Override
    public void on() {
    }

    @Override
    public void off() {
    }

    @Override
    public boolean isOn() {
        if (this.state.equals("on")) {
            return true;
        }
        return false;
    }

    @Override
    public int measure() {
        return this.temperature;
    }
}
