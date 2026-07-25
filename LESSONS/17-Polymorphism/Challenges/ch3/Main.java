
public class Main {
    public static void main(String[] args) {
        Switchable[] devices = {
                new SmartAirConditioner(),
                new SmartLamp()
        };

        EnergyMonitor[] monitored = {
                new SmartAirConditioner(),
                new SmartLamp()
        };

        for (Switchable device : devices) {
            device.turnOn();
            device.turnOff();
        }

        for (EnergyMonitor monitor : monitored) {
            monitor.displayPowerUsage();
        }
    }
}
