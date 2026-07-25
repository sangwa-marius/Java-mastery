public class SmartLamp implements Switchable,EnergyMonitor {
    
   @Override
    public void turnOn() {
        System.out.println("Turned on smart  lamp");
    }

    @Override
    public void displayPowerUsage() {
        System.out.println("Displaying power usage...");
    }


    @Override
    public void  turnOff(){
        System.out.println("Smart lamp turned off");
    }

}
