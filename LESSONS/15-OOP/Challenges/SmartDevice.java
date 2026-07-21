
public class SmartDevice {
    private String deviceName;
    private boolean poweredOn;
    private double powerUsage;

    private Owner owner;
    private Room room;

    private static int totalDevices;

    public SmartDevice(String deviceName, double powerUsage, Owner owner, Room room) {
        this.deviceName = deviceName;
        this.powerUsage = powerUsage;
        this.owner = owner;
        this.room = room;

        totalDevices++;
    }

    public SmartDevice(String deviceName, Owner owner, Room room) {
        this.deviceName = deviceName;
        this.owner = owner;
        this.room = room;
        this.powerUsage = 15.0;
        totalDevices++;
    }

    public void turnOn() {
        if (poweredOn) {
            System.out.println(deviceName + " is already ON");
            return;
        } else {
            poweredOn = true;
        }
    }

    public void turnOff() {
        if (!poweredOn) {
            System.out.println("Device already OFF!");
            return;
        } else {
            poweredOn = false;
        }
    }

    public void setOwner(Owner newOwner) {
        owner = newOwner;
    }

    public void togglePower() {
        poweredOn = !poweredOn;
    }

    public void setPowerUsage(double powerUsage) {
        if (powerUsage <= 0) {
            System.err.println("Power usage must be greater than zero");
            return;
        } else {

            this.powerUsage = powerUsage;
        }
    }

    public String getDeviceName() {
        return deviceName;
    }

    public double getPowerUsage() {
        return powerUsage;
    }

    public Owner getOwner() {
        return owner;
    }

    public Room getRoom() {
        return room;
    }

    public void diplaySmartDevice() {
        System.out.println("\n=================================\n");
        System.out.println("Device Name : " + deviceName);
        System.out.println("Status      : " + (poweredOn ? "ON" : "OFF"));
        System.out.println("Power Usage : " + powerUsage);
        owner.displayOwner();
        room.displayRoom();
        System.out.println("\n=================================\n");
    }

    public static void displayTotalDevices() {
        System.out.println("Total Devices: " + totalDevices);
    }

}
