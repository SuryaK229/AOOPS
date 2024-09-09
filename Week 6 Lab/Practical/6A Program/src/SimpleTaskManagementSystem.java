import java.util.ArrayList;
import java.util.Scanner;

public class SimpleTaskManagementSystem {
    static ArrayList<String> tasks = new ArrayList<>();

    static void addTask(String description) {
        tasks.add(description);
        System.out.println("Task added successfully.");
    }

    static void updateTask(int index, String newDescription) {
        if (index >= 0 && index < tasks.size()) {
            tasks.set(index, newDescription);
            System.out.println("Task updated successfully.");
        } else {
            System.out.println("Invalid task index.");
        }
    }

    static void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task removed successfully.");
        } else {
            System.out.println("Invalid task index.");
        }
    }

    static void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTask Management System");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    addTask(description);
                    break;
                case 2:
                    System.out.print("Enter task index to update: ");
                    int updateIndex = scanner.nextInt() - 1;
                    scanner.nextLine();
                    System.out.print("Enter new task description: ");
                    String newDescription = scanner.nextLine();
                    updateTask(updateIndex, newDescription);
                    break;
                case 3:
                    System.out.print("Enter task index to remove: ");
                    int removeIndex = scanner.nextInt() - 1;
                    removeTask(removeIndex);
                    break;
                case 4:
                    displayTasks();
                    break;
                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            scanner.close();
        }
    }
}
