public class BankTransferPayment extends Payment {
    @Override
    protected void processPayment(){
        super.processPayment();
        System.out.println("Processing Bank Transfer...");
    }
}
