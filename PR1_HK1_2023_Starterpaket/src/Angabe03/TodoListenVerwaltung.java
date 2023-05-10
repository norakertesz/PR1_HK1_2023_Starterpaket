package Angabe03;

import java.util.Arrays;

public class TodoListenVerwaltung {
    private Task[] tasks;
    private int nextId;

    public TodoListenVerwaltung() {
        this.tasks = new Task[10];
        this.nextId = 0;
    }

    public void addTask(String title) {
        Task newTask = new Task(nextId, title);
        tasks[nextId] = newTask;
        nextId++;

    }

    public Task getTask(int id) {
        for (Task task : tasks) {
            if (task != null && task.getId() == id) {
                return task;
            }
        }
return null;
    }

public void markTaskComplete(int id){
       Task task=getTask(id);
       if(task!=null){
           task.setComplete(true);
       }
}

//    public void deleteTask(int id){
//        for (Task task:tasks) {
//            if(task!=null&&task.getId()==id){
//                task=null; // die for-each-Schleife ändert nicht den Array selbst
//                break;
//            }
//        }
//
//    }
public void deleteTask(int id){
       for (int i = 0; i < nextId; i++) {
        if (tasks[i].getId() == id) {
            tasks[i] = null;
            break;
        }
    }

}

    public Task displayTasks(){
        System.out.println("ID "+"   TITLE "+"  Status ");
        for (int i = 0; i < tasks.length; i++) {
            if(tasks[i]!=null){

            System.out.println(tasks[i].getId()+" "+tasks[i].getTitle()+" "+tasks[i].isStatus());
        }}
        return null;
    }


    @Override
    public String toString() {
        return "TodoListenVerwaltung{" +
                "tasks=" + Arrays.toString(tasks) +
                '}';
    }
}