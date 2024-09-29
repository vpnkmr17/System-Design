
public class Client {
    
    public static void main(String[] args) {
        UpiPaymentMode upiPayMode = new UpiPaymentMode();
        // Payment Service class with Open closed principle
        PaymentServiceWithOC payWithOc = new PaymentServiceWithOC(upiPayMode);
        payWithOc.doPayment();
    }
}
