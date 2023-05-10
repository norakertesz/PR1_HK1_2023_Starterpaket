package Angabe03;

class Task {
private int id;
private String title;
private boolean isComplete;

    public Task(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isStatus() {
        return isComplete;
    }

    public void setStatus(boolean isComplete) {
        this.isComplete = isComplete;
    }
    public void setComplete(boolean taskCompletion) {
        this.isComplete = taskCompletion;
    }

    @Override
    public String toString() {
        return "Task:" + id +"."+ title  +
                " Status:" + isComplete;
    }
}
