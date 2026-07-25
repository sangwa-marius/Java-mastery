public class MotorbikeDelivery extends DeliveryService {
    public MotorbikeDelivery(String companyName){
        super(companyName);
    }

    @Override
    public void deliverPackage(){
        System.out.println(companyName + " delivering on Motor bike\n");
    }
}
