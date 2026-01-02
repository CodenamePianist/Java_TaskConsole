import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static String[] managerNames = {"Jarvis", "Trixie Mattel", "Sailor Venus", "Whitney Houston"};
    public static String randomName(String[] names) {
        Random rand = new Random();
        int randomIndex = rand.nextInt(names.length);
        return names[randomIndex];
    };

    // When a task is created, can it be stored as something similar to a Javascript object with key-value pairs?
    // The closest thing I've found to this would be a hashmap, but I'm not sure if that will fulfill what I'm looking for
    // Gotta do more research tomorrow
    // Update: HASHMAP WORKS!!! Set the second argument to Object and that will allow me to have each value keep its type when it's created

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        int choice;
        int subChoice;
        List<Task> taskList = new ArrayList<>();
        int idCount = 0;
        String assistant = randomName(managerNames);
        System.out.println("Welcome to Taskarella, your personal task manager! I'm " + assistant + ", your personal assistant. How can I help you today?" );
        do {
            System.out.println("1. View all my tasks");
            System.out.println("2. Create a new task");
            System.out.println("3. Update an existing task");
            System.out.println("4. Mark a task as complete");
            System.out.println("5. Exit Task Manager");

            choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    if (taskList.isEmpty()) {
                        System.out.println("You have no tasks at this time.");
                    } else {
//                        System.out.println(taskList);
                        for (Task task : taskList) {
                            System.out.println(task);
                        };
                    };
                    break;
                case 2:
                    System.out.println("Is this a personal or work task?");
                    do {
                        System.out.println("Press 1 to create a Personal task.");
                        System.out.println("Press 2 to create a Work task.");
                        System.out.println("Press 3 to return to the main menu.");

                        subChoice = scanner.nextInt();

                        switch (subChoice) {
                            case 1:
                                //Logic goes here to create a new personal task, put it in a hashmap, and add it to the taskList array list
                                scanner.nextLine();

                                System.out.println("Enter task title:");
                                String newPersonalTaskTitle = scanner.nextLine();

                                System.out.println("Write a brief description for this task:");
                                String newPersonalTaskDescription = scanner.nextLine();

                                Task newPersonalTask = new PersonalTask(++idCount, newPersonalTaskTitle, newPersonalTaskDescription);
                                newPersonalTask.display();

                                taskList.add(newPersonalTask);

                                System.out.println(taskList);
                                break;
                            case 2:
                                //Logic goes here to create a new work task, put it in a hashmap, and add it to the taskList array list
                                scanner.nextLine();

                                System.out.println("Enter task title:");
                                String newWorkTaskTitle = scanner.nextLine();

                                System.out.println("Write a brief description for this task:");
                                String newWorkTaskDescription = scanner.nextLine();

                                Task newWorkTask = new WorkTask(++idCount, newWorkTaskTitle, newWorkTaskDescription);
                                newWorkTask.display();

                                taskList.add(newWorkTask);

                                System.out.println(taskList);
                                break;
                            case 3:
                                System.out.println("Returning to the main menu.");
                                break;
                            default:
                                System.out.println("Invalid selection, please try again.");
                        }
                    } while (subChoice != 3);
                    break;
                case 3:
                    //Logic will go here to update an existing task. Remember, only descriptions can be updated here.
                    scanner.nextLine();

                    if (taskList.isEmpty()) {
                        System.out.println("You have no tasks to update at this time.");
                    } else {
                        System.out.println("Enter the ID number for the task you would like to update:");
                        for (Task task: taskList) {
                            System.out.println(task);
                        };
                        int idNumber = scanner.nextInt();
                        for (Task task: taskList) {
                            if (task.taskId == idNumber) {
                                scanner.nextLine();
                                System.out.println("Please enter the updated description.");
                                String updatedDescription = scanner.nextLine();
                                task.setDescription(updatedDescription);
                                System.out.println(task);
                            };
                        };
                    };
                    break;
                case 4:
                    //Logic will go here to mark a task as completed. This should be pretty similar to updating the description
                    scanner.nextLine();

                    if (taskList.isEmpty()) {
                        System.out.println("You have no tasks to mark as complete at this time.");
                    };

                    System.out.println("Enter the ID number of the task you have completed:");
                    for (Task task: taskList) {
                        System.out.println(task);
                    };
                    int completedTaskId = scanner.nextInt();
                    for (Task task: taskList) {
                        if (task.taskId == completedTaskId) {
                            task.markCompleted();
                            System.out.println("Nice job completing task number " + task.taskId + "!");
                        };
                    };
                    break;
                case 5:
                    System.out.println("Thank you for using Taskarella, we hope to see you again!");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 5);

        scanner.close();

//        Map<String, Object> taskMap = new HashMap<>();
//        Task newTask = new WorkTask(1, "Eat a cookie", "Get a chocolate chip cookie and devour it");
//        taskMap.put("title", newTask.title);
//        taskMap.put("description", newTask.description);
//        taskMap.put("id", newTask.taskId);
//        taskMap.put("completion status", newTask.getStatus());
//
//        System.out.println(taskMap);

    }
}