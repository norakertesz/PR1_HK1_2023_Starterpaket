package Angabe03;

import java.util.ArrayList;

public class TodoListenVerwaltung2 {
    private ArrayList<Task> myTasks=new ArrayList<>();

    public TodoListenVerwaltung2() {
        this.myTasks = myTasks;
    }

    public void addTask(Task t) {
        myTasks.add(t);
    }

    public void removeTask(Task t) {
        myTasks.remove(t);
    }

    public Task getTask(int id) {
        for (Task task : myTasks) {
            if (task.getId() == id) {
                return task;
            }

        }
        return null;


    }


    public Task print() {

        System.out.println("ID" + "\t" + "Title" + "\t" + "Status");
        for (Task task : myTasks) {
            System.out.println(task.getId() + "\t" + task.getTitle() + "\t" + task.isStatus());
        }
        return null;
    }

    @Override
    public String toString() {
        return "TodoListenVerwaltung2{" +
                "myTasks=" + myTasks +
                '}';
    }
}
