public class Main {
    public static void main(String[] args) {
        DeliveryService[] services = {
                new DroneDelivery("SkyExpress"),
                new MotorbikeDelivery("QuickRide"),
                new TruckDelivery("CargoMax")
        };

        for (DeliveryService service : services) {

            service.displayCompany();
            service.deliverPackage();

        }
    }
}
