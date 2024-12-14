
# To-Do List Application

This is a simple command-line To-Do list application implemented in Java. The application allows users to:

- Add tasks
- List tasks
- Edit tasks
- Remove tasks
- Exit the program

## Features

1. **Add Task**: Allows the user to input a new task, which is then added to the list.
2. **List Tasks**: Displays all the tasks in the list.
3. **Edit Task**: The user can select a task to edit and input a new description.
4. **Remove Task**: Allows the user to select a task from the list and remove it.
5. **Exit**: Exits the application.

## Requirements

- Java 8 or higher
- Basic terminal or command-line interface

## How to Run

1. Clone the repository or copy the Java file.
2. Compile the `ToDoList.java` file:
   ```bash
   javac ToDoList.java
   ```
3. Run the program:
   ```bash
   java ToDoList
   ```

## Usage

When you run the program, a menu will be displayed in the terminal with options to add, list, edit, or remove tasks. Enter the number corresponding to the desired action.

### Example Output:

```
----- To-Do List -----
1. Add Task
2. List Tasks
3. Edit Task
4. Remove Task
5. Exit
Choose an option: 1
Enter the task: Buy groceries
Task successfully added.

----- To-Do List -----
1. Add Task
2. List Tasks
3. Edit Task
4. Remove Task
5. Exit
Choose an option: 2

Tasks:
1. Buy groceries
```
