

public abstract class DeliveryService {
    protected String companyName;

    public DeliveryService(String companyName){
        this.companyName = companyName;
    }

    public void displayCompany(){
        System.out.println("Company name: "+companyName);
    }

    public abstract void deliverPackage();
}
