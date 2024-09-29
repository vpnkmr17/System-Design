public class PaymentServiceWithOC {
    PaymentMode payMode;
    
    PaymentServiceWithOC(PaymentMode payMode) {
        this.payMode = payMode;
    }

    public void doPayment() {
        this.payMode.doPayment();
    }

}