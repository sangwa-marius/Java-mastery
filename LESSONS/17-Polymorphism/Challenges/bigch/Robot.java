public abstract class Robot {
    private int id;
    private String manufacturer;

    public Robot(int id, String manufacturer) {
        this.id = id;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Manufacturer: " + manufacturer);
    }

    public abstract void performTask();
}