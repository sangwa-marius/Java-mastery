

public class Main {
    public static void main(String[] args){
        Robot[] robots = {
            new DeliveryRobot(1, "MariusTech"),
            new CleaningRobot(2, "SamTech"),
            new InspectionRobot(3, "Marius")
        };

        // for(Robot robot : robots){
        //     robot.displayInfo();
        //     robot.performTask();
        //     System.out.println();
        // }

        Rechargeable[] rechargeables = {
            new DeliveryRobot(1, "Marius"),
            new CleaningRobot(2, "MariusTech")
        };

        WiFiEnable[] wiFiEnables = {
            new DeliveryRobot(1, "Marius"),
            new InspectionRobot(3, "mariusTech")
        };

        for(Rechargeable rechargeable: rechargeables){
            rechargeable.recharge();
        }

        for(WiFiEnable wiFiEnable : wiFiEnables){
            wiFiEnable.connect();
        }
    }
}
