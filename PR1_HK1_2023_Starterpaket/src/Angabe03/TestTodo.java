package Angabe03;

public class TestTodo {
    public static void main(String[] args) {
        TodoListenVerwaltung todolist = new TodoListenVerwaltung();
        todolist.addTask("Play hard!");
        todolist.addTask("Work hard!");
        todolist.addTask("Work harder!");
        System.out.println(todolist.getTask(1));
        todolist.deleteTask(0);
        System.out.println(todolist.getTask(0));
        todolist.displayTasks();
        todolist.markTaskComplete(1);
        todolist.displayTasks();
    }
}
