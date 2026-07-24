public class CreditCardPayment extends Payment {
    
    @Override
    protected void processPayment(){
        super.processPayment();
        System.out.println("Processing credit Card Payment...");
    }
}
