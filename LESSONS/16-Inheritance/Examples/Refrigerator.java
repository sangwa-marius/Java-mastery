public class Refrigerator extends Appliance {

    private int capacity;
    
    public Refrigerator(String brand, int powerRating, int capacity){
        super(brand, powerRating);
        this.capacity = capacity;
    }

    public void displayInfo(){
        System.out.println();
        System.out.println("Brand    : " +brand);
        System.out.println("Power    : " + powerRating + "W");
        System.out.println("Capacity : " + capacity + "L");
    }
}
