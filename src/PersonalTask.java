public class PersonalTask extends Task{
    public PersonalTask(int taskId, String title, String description) {
        super(taskId, title, description);
    }

    @Override
    public String display() {
        title = "[PERSONAL] " + title;
        return title;
    }

    @Override
    public void showTasks(Task[] tasks) {
        for (Task task : tasks) {
            if (task.title.contains("[PERSONAL]")) {
                System.out.println(task);
            } else {
                System.out.println("You have no personal tasks at this time.");
            };
        };
    }
}
