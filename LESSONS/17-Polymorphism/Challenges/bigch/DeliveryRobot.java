public class DeliveryRobot extends Robot implements Rechargeable, WiFiEnable {
    public DeliveryRobot(int id, String manufacturer) {
        super(id, manufacturer);
    }

    @Override
    public void performTask() {
        System.out.println("Delivering package...");
    }

    @Override
    public void recharge() {
        System.out.println(getId() + " Recharging...");
    }

    @Override
    public void connect() {
        System.out.println(getId() + " Connecting...");
    }
}
