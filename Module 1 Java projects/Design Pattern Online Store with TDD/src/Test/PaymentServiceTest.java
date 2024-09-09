package Test;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class PaymentServiceTest {

    @Test
    public void testProcessPayment() {
        System.out.println("Running testProcessPayment");

        PaymentService paymentService = new PaymentServiceImpl();
        try {
            paymentService.processPayment(100.0);
            System.out.println("Payment processed successfully");
            assertTrue(true);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
            assertTrue(false);
        }
    }
}
