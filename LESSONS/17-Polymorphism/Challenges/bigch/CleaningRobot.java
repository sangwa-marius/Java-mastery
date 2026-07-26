public class CleaningRobot
        extends Robot
        implements Rechargeable {

    public CleaningRobot(int id, String manufacturer) {
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

}
