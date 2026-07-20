public class Battery {
    private double capacity;
    private double health;

    public Battery(double capacity, double health){
        this.capacity = capacity;
        this.health = health;
    }

    public void displayInfo(){
        System.out.println("\nBattery Information\nCapacity : "+capacity);
        System.out.println("Health   : "+health);
    }
}
