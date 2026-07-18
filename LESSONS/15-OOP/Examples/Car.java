public class Car {
    String brand;
    String model;
    double speed;
    double fuelLevel;

    public void startEngine(){
        speed += 2;
    }

    public void accelerate(int amount){
        speed += amount;
    }

    public void brake(int amount){
        speed -= amount;
    }

    public void displayStatus(){
        System.out.println("Status: "+ (speed>0? "Moving":"Stationery"));
        System.out.println("Speed: "+speed);
    }
}
