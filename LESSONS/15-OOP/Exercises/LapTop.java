public class LapTop {
    private String brand;
    private String model;
    private Battery battery;

    public LapTop(String brand, String model, Battery battery) {
        this.brand = brand;
        this.model = model;
        this.battery = battery;
    }

    public void setBatter(Battery battery) {
        this.battery = battery;
    }

    public void displayLapTopInfo() {
        System.out.println("\nLaptop brand : " + brand);
        System.out.println("Laptop model : " + model);
        battery.displayInfo();
    }
}
