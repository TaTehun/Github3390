import java.util.Scanner;

public class RemoveTaskCommand {
    public static void execute(Scanner scanner, TaskList taskList) {
        System.out.print("Enter task number to delete: ");
        int index = scanner.nextInt() - 1;
        taskList.removeTask(index);
    }
}
