import java.util.List;

public class WorkTask extends Task {
    public WorkTask(int taskId, String title, String description) {
        super(taskId, title, description);
    }

    @Override
    public String display() {
        return "[WORK] " + title;
    };


}
