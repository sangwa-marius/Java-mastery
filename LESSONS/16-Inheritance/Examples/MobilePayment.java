public class MobilePayment extends Payment {
    @Override
    protected void processPayment(){
        super.processPayment();
        System.out.println("Processing Mobile Payment...");
    }
}
