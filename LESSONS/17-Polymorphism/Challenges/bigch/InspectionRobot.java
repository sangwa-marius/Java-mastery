public class InspectionRobot
        extends Robot
        implements WiFiEnable {

    public InspectionRobot(int id, String manufacturer) {
        super(id, manufacturer);
    }

    @Override
    public void performTask() {
        System.out.println("Inspecting storage shelves..");
    }

    @Override
    public void connect() {
        System.out.println(getId() + " Connecting...");
    }
}
