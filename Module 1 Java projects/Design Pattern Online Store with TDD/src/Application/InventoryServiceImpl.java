package Application;
// InventoryServiceImpl.java

public class InventoryServiceImpl implements InventoryService {
    @Override
    public void updateInventory(String item, int quantity) {
        // Logic to update inventory
        System.out.println("Updating inventory for item: " + item + " with quantity: " + quantity);
    }
}