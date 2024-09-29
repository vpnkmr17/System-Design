public class PaymentService {
    private String bankName;
    private PayMode paymentMode;

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setPaymentMode(PayMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public void doPayment() {
        switch (paymentMode) {
            case UPI:
                // Business logic to do payment via UPI

            case NETBANKING:
                // Business Logic to do payment via NetBanking
        }
    }
}

enum PayMode {
    UPI,
    NETBANKING
}