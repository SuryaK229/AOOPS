import java.util.*;

public class ContactManager{
    private Set<Contact> contacts;
    private Map<String, Contact> contactsByName;
    private Map<String, Contact> contactsByPhoneNumber;

    public ContactManager() {
        contacts = new HashSet<>();
        contactsByName = new HashMap<>();
        contactsByPhoneNumber = new HashMap<>();
    }

    public boolean addContact(Contact contact) {
        if (contacts.add(contact)) {
            contactsByName.put(contact.getName(), contact);
            contactsByPhoneNumber.put(contact.getPhoneNumber(), contact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        if (contacts.remove(contact)) {
            contactsByName.remove(contact.getName());
            contactsByPhoneNumber.remove(contact.getPhoneNumber());
            return true;
        }
        return false;
    }

    public Contact getContactByName(String name) {
        return contactsByName.get(name);
    }

    public Contact getContactByPhoneNumber(String phoneNumber) {
        return contactsByPhoneNumber.get(phoneNumber);
    }

    public Set<Contact> getContacts() {
        return contacts;
    }
}
