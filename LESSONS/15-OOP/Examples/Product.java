public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double  price, int quantity){
        this.name = name;
        this.price =  price;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setPrice(double amount){
        if(amount > 0)
            price =amount;
        else
            System.out.println("invalid price.Price should be greater than 0");
            return;
    }

    public void sellQuantity(int quantity){
        if(quantity > this.quantity)
            System.out.println("No enough quantity");
        else
            this.quantity -=quantity;
    }

    public void displayInfo(){
        System.out.println("\nName     : "+name);
        System.out.println("Price    : $"+price);
        System.out.println("Quantity : "+quantity + "kg");
    }
}
