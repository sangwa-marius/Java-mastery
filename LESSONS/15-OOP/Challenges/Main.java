public class Main {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Alice", "alice@gmail.com");
        Owner owner2 = new Owner("Bob", "bob@gmail.com");

        Room room1 = new Room("Kitchen", 23.4);
        Room room2 = new Room("Bedroom", 34.3);
        Room room3 = new Room("Office", 45.6);

        SmartDevice[] smartDevices = {
                new SmartDevice("Smart Lamp", owner2, room3),
                new SmartDevice("Air Conditioner", 45, owner1, room2),
                new SmartDevice("Security Camera", owner1, room1),
                new SmartDevice("Coffee Machine", owner2, room1)
        };

        for(SmartDevice device: smartDevices){
            device.diplaySmartDevice();
        }

        SmartDevice.displayTotalDevices();
    }

}