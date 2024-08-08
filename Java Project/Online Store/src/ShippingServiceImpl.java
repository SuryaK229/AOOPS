// ShippingServiceImpl.java
public class ShippingServiceImpl implements ShippingService {
    @Override
    public void shipItem(String item, String address) {
        // Logic to ship item
        System.out.println("Shipping item: " + item + " to address: " + address);
    }
}