public class AdapterPatternTest {
    public static void main(String[] args) {
        PaymentProcessor payPalProcessor = new PayPalAdapter(new PayPal());

        payPalProcessor.processPayment(69.0);
        
    }
}
