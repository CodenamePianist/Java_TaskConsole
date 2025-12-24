import java.util.List;

public class WorkTask extends Task {
    public WorkTask(int taskId, String title, String description) {
        super(taskId, title, description);
    }

    @Override
    public String display() {
        title = "[WORK]" + title;
        return title;
    }

    @Override
    public void showTasks(Task[] tasks) {
        for (Task task : tasks) {
            if (task.title.contains("[WORK]")) {
                System.out.println(task);
            } else {
                System.out.println("You have no work tasks at this time.");
            };
        };
    };
}
