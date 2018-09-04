package ex20SensorsTemperatureManagement;

import java.util.Random;

public class Thermometer implements Sensor{

    private String state;

    public Thermometer() {
        this.state = "off";
    }

    @Override
    public void on() {
        this.state = "on";
    }

    @Override
    public void off() {
        this.state = "off";
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
        if (this.state.equals("on")){
            return new Random().nextInt(60) - 30;
        }
        return 0;
    }
}
