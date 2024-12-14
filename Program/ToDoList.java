import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    // List to store tasks
    private static ArrayList<String> tasks = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display the menu to the user
            System.out.println("\n----- To-Do List -----");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Edit Task");
            System.out.println("4. Remove Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            int option = scanner.nextInt();
            scanner.nextLine(); // Clears the scanner buffer

            switch (option) {
                case 1:
                    // Add task
                    addTask(scanner);
                    break;
                case 2:
                    // List tasks
                    listTasks();
                    break;
                case 3:
                    // Edit task
                    editTask(scanner);
                    break;
                case 4:
                    // Remove task
                    removeTask(scanner);
                    break;
                case 5:
                    // Exit the program
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Function to add a task to the list
    private static void addTask(Scanner scanner) {
        System.out.print("Enter the task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task successfully added.");
    }

    // Function to list all tasks
    private static void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            System.out.println("\nTasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    // Function to edit a task
    private static void editTask(Scanner scanner) {
        listTasks();
        System.out.print("Enter the task number to edit: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine(); // Clears the buffer
        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            System.out.print("Enter the new task: ");
            String newTask = scanner.nextLine();
            tasks.set(taskNumber - 1, newTask);
            System.out.println("Task successfully edited.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    // Function to remove a task
    private static void removeTask(Scanner scanner) {
        listTasks();
        System.out.print("Enter the task number to remove: ");
        int taskNumber = scanner.nextInt();
        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            tasks.remove(taskNumber - 1);
            System.out.println("Task successfully removed.");
        } else {
            System.out.println("Invalid task number.");
        }
    }
}
