import java.util.ArrayList;
import java.util.List;

public abstract class Task {

    protected int taskId;
    protected String title;
    private String description;
    private String completionStatus;

    public Task(int taskId, String title, String description, String completionStatus) {
        this.taskId = taskId;
        this.title = title;
        this.description = description;
        this.completionStatus = "incomplete";
    }

    List<Object> taskList = new ArrayList<>();

    public abstract void setTitle(String taskTitle);

    public String getTitle() {
        return title;
    };
    // So when a user creates a new task, it needs a title. It also needs a description. New tasks default with an incomplete status. Is there a way I can increment the taskId?

    public void setDescription(String newDescription) {
        if (newDescription.isEmpty()) {
            System.out.println("A new task must have a description");
        } else {
        description = newDescription;
        };
    };

    public String getDescription() {
        return description;
    };

    public void markCompleted() {
        if (completionStatus.equals("completed")) {
            System.out.println("This task has already been completed!");
        }else {
            completionStatus = "completed";
        };

    };

    public abstract void display(List<Object> tasks);
}
