import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleToDoList {
    static List<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Task\n2. Update Task\n3. Remove Task\n4. Display Tasks\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    tasks.add(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Enter task index to update: ");
                    int updateIndex = scanner.nextInt() - 1;
                    scanner.nextLine();
                    if (updateIndex >= 0 && updateIndex < tasks.size()) {
                        System.out.print("Enter new description: ");
                        tasks.set(updateIndex, scanner.nextLine());
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 3:
                    System.out.print("Enter task index to remove: ");
                    int removeIndex = scanner.nextInt() - 1;
                    if (removeIndex >= 0 && removeIndex < tasks.size()) {
                        tasks.remove(removeIndex);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 4:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
            scanner.close();
        }
    }
}
