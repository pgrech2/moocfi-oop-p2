package ex20SensorsTemperatureManagement;

public class ex20SensorsTemperatureManagement {

    public static void main (String [] args ) {
        System.out.println("Example 20:");

        System.out.println("Example 20.1");
        ConstantSensor ten = new ConstantSensor(10);
        ConstantSensor minusFive = new ConstantSensor(-5);

        System.out.println( ten.measure() );
        System.out.println( minusFive.measure() );

        System.out.println( ten.isOn() );
        ten.off();
        System.out.println( ten.isOn() );

        System.out.println("Example 20.2");
        Sensor kumpula = new Thermometer();
        kumpula.on();
        System.out.println("the temperature in Kumpula is "+kumpula.measure() + " degrees");
    }
}
