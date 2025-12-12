import java.util.ArrayList;
import java.util.List;

public abstract class Task {

    protected int taskId;
    protected String title;
    protected String description;
    protected String completionStatus;

    public Task(int taskId, String title, String description, String completionStatus) {
        this.taskId = taskId;
        this.title = title;
        this.description = description;
        this.completionStatus = completionStatus;
    }

    List<Object> taskList = new ArrayList<>();

    // So when a user creates a new task, it needs a title. It also needs a description. New tasks default with an incomplete status. Is there a way I can increment the taskId?
    public abstract String newTaskTitle(String newTitle);

    public String newTaskDescription(String newDescription) {
        description = newDescription;
        return newDescription;
    }

    public String newTaskCompletion(boolean newStatus) {
        newStatus = false;
        if (newStatus == false) {
            return "incomplete";
        } else {
            return "complete";
        }
    }
}
