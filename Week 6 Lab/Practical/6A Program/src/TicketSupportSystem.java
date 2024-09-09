import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TicketSupportSystem {
    private Queue<String> tickets = new LinkedList<>();

    public void addTicket(String ticket) {
        tickets.add(ticket);
        System.out.println("Ticket added successfully.");
    }

    public void processTicket() {
        if (tickets.isEmpty()) {
            System.out.println("No tickets to process.");
        } else {
            String ticket = tickets.poll();
            System.out.println("Processed ticket: " + ticket);
        }
    }

    public void displayTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No pending tickets.");
        } else {
            System.out.println("Pending tickets:");
            int i = 1;
            for (String ticket : tickets) {
                System.out.println(i++ + ". " + ticket);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicketSupportSystem supportSystem = new TicketSupportSystem();

        while (true) {
            System.out.println("\nCustomer Support Ticket System");
            System.out.println("1. Add Ticket");
            System.out.println("2. Process Ticket");
            System.out.println("3. Display Tickets");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ticket description: ");
                    String ticket = scanner.nextLine();
                    supportSystem.addTicket(ticket);
                    break;
                case 2:
                    supportSystem.processTicket();
                    break;
                case 3:
                    supportSystem.displayTickets();
                    break;
                case 4:
                    System.out.println("Exiting the system. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            scanner.close();
        }
    }
}
