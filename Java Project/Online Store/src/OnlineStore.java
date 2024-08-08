// OnlineStore.java
public class OnlineStore {
    private PaymentService paymentService;
    private InventoryService inventoryService;
    private ShippingService shippingService;

    public OnlineStore(PaymentService paymentService, InventoryService inventoryService, ShippingService shippingService) {
        this.paymentService = paymentService;
        this.inventoryService = inventoryService;
        this.shippingService = shippingService;
    }

    public void placeOrder(String item, int quantity, double amount, String address) {
        inventoryService.updateInventory(item, quantity);
        paymentService.processPayment(amount);
        shippingService.shipItem(item, address);
        System.out.println("Order placed successfully!");
    }

    public static void main(String[] args) {
        // Manually create the service implementations
        PaymentService paymentService = new PaymentServiceImpl();
        InventoryService inventoryService = new InventoryServiceImpl();
        ShippingService shippingService = new ShippingServiceImpl();

        // Inject the services into the OnlineStore
        OnlineStore onlineStore = new OnlineStore(paymentService, inventoryService, shippingService);
        
        // Place an order
        onlineStore.placeOrder("Laptop", 1, 1200.00, "123 Main St, Anytown, USA");
    }
}
