public class TruckDelivery extends DeliveryService {
    public TruckDelivery(String companyName){
        super(companyName);
    }

    @Override
    public void deliverPackage(){
        System.out.println(companyName + " delivering on A truck\n");
    }
}
