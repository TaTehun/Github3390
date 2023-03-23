import java.util.Scanner;

public class AddTaskCommand {
    public static void execute(Scanner scanner, TaskList taskList) {
        System.out.print("Enter task: ");
        String task = scanner.nextLine();
        taskList.addTask(task);
    }
}
