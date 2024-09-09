public class Main {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();

        Contact contact1 = new Contact("Alice", "1234567890", "alice@example.com");
        Contact contact2 = new Contact("Bob", "0987654321", "bob@example.com");
        Contact contact3 = new Contact("Charlie", "1234509876", "charlie@example.com");

        manager.addContact(contact1);
        manager.addContact(contact2);
        manager.addContact(contact3);

        System.out.println("All Contacts:");
        for (Contact contact : manager.getContacts()) {
            System.out.println(contact);
        }

        System.out.println("\nGet Contact by Name (Alice):");
        System.out.println(manager.getContactByName("Alice"));

        System.out.println("\nGet Contact by Phone Number (1234509876):");
        System.out.println(manager.getContactByPhoneNumber("1234509876"));

        manager.removeContact(contact2);

        System.out.println("\nAll Contacts after removing Bob:");
        for (Contact contact : manager.getContacts()) {
            System.out.println(contact);
        }
    }
}
