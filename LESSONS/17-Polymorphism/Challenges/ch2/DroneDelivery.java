
public class DroneDelivery extends DeliveryService {
    public DroneDelivery(String companyName){
        super(companyName);
    }

    @Override
    public void deliverPackage(){
        System.out.println(companyName + " delivering on a Drone.\n");
    }
}
