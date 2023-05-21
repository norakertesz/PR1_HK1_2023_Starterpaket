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

        TodoListenVerwaltung2 myList = new TodoListenVerwaltung2();
        Task task = new Task(1, "Haho");
        Task task2 = new Task(2, "Haho2");
        myList.addTask(task);
        myList.addTask(task2);
        myList.print();

    }
}
