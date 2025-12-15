import java.util.List;

public class PersonalTask extends Task{
    public PersonalTask(int taskId, String title, String description, String completionStatus) {
        super(taskId, title, description, completionStatus);
    }


    public void setTitle(String taskTitle) {
        if (taskTitle.isEmpty()) {
            System.out.println("New tasks must have a title.");
        } else {
        title = "[PERSONAL] " + taskTitle;
        };
    }

    @Override
    public void display(List<Object> tasks) {

    }
}
