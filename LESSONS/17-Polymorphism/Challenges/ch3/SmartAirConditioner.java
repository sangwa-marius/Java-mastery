
public class SmartAirConditioner implements EnergyMonitor, Switchable, WiFiEnabled {

    @Override
    public void turnOn() {
        System.out.println("Turned on SmartAirConditioner");
    }

    @Override
    public void displayPowerUsage() {
        System.out.println("Displaying power usage...");
    }

    @Override
    public void connect() {
        System.out.println("Smart Air Conditioner connected to Wi-Fi");
    }

    @Override
    public void disconnect() {
        System.out.println("Turned off smart air conditioner");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart air conditioner turned off");
    }
}
