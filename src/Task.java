import java.util.ArrayList;
import java.util.List;

public abstract class Task {

    protected int taskId;
    protected String title;
    protected String description;
    private String completionStatus;

    public Task(int taskId, String title, String description) {
        this.taskId = taskId;
        this.title = title;
        this.description = description;
        this.completionStatus = "incomplete";
    }

    public String getDescription() {
        return description;
    };

    public void setDescription(String newDescription){
            description = newDescription;
    };

    public void markCompleted() {
        if (completionStatus.equals("completed")) {
            System.out.println("This task has already been completed!");
        }else {
            completionStatus = "completed";
        };

    };

    public String getStatus() {
        return completionStatus;
    };

    public abstract String display();

    @Override
    public String toString() {
        return "{ " +
                "title = " + title +
                ", description = " + description +
                ", id = " + taskId +
                ", completion status = " + getStatus() +
                " }";
    }

}
