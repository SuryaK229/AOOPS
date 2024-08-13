// Abstract Product
interface PaymentMethod {
    void pay(double amount);
}

// Concrete Products
class CreditCard implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class PayPal implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}
abstract class PaymentFactory {
    public abstract PaymentMethod createPaymentMethod();
}

class CardPaymentFactory extends PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new CreditCard();
    }
}

class PayPalPaymentFactory extends PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new PayPal();
    }
}
