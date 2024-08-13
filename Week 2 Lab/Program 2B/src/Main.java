public class Main {
    public static void main(String[] args) {
        // Singleton for User Authentication
        UserAuthentication auth = UserAuthentication.getInstance();
        auth.login("Alice");

        // Factory Method for Vehicle Creation
        VehicleFactory vehicleFactory = new CarFactory(); // or BikeFactory
        Vehicle vehicle = vehicleFactory.createVehicle();
        vehicle.startRide();

        // Abstract Factory for Payment Method
        PaymentFactory paymentFactory = new CardPaymentFactory(); // or PayPalPaymentFactory
        PaymentMethod paymentMethod = paymentFactory.createPaymentMethod();
        paymentMethod.pay(50.0);

        auth.logout();
    }
}
