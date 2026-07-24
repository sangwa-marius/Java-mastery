public class Vehicle {
    protected String brand;
    protected String year;

    public void statEngine(){
        System.out.println(brand + " is Starting");
    }

    public void displayInfo(){
        System.out.println("\nBrand : " + brand);
        System.out.println("Year  : " + year);
    }
}
