public class PersonalTask extends Task{
    public PersonalTask(int taskId, String title, String description) {
        super(taskId, title, description);
    }

    @Override
    public String display() {
        title = "[PERSONAL] " + title;
        return title;
    }
}
