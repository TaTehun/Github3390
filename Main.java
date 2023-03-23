import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskList taskList = new TaskList();
        boolean running = true;

        while (running) {
            Menu.displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    AddTaskCommand.execute(scanner, taskList);
                    break;
                case 2:
                    RemoveTaskCommand.execute(scanner, taskList);
                    break;
                case 3:
                    taskList.displayTasks();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}