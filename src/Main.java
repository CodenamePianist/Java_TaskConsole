import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static String[] managerNames = {"Jarvis", "Trixie Mattel", "Sailor Venus", "Whitney Houston"};
    public static String randomName(String[] names) {
        Random rand = new Random();
        int randomIndex = rand.nextInt(names.length);
        return names[randomIndex];
    };

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
            subChoice = scanner.nextInt();
            switch (choice){
                case 1:
                    if (taskList.isEmpty()) {
                        System.out.println("You have no tasks at this time.");
                    } else {
                        System.out.println(taskList);
                    };
                    break;
                case 2:
                    System.out.println("Is this a personal or work task?");
                    do {
                        System.out.println("Personal");
                        System.out.println("Work");
                        System.out.println("Would you like to return to the main menu?");
                        switch (subChoice) {
                            case 1:
                                //Logic goes here to create a new personal task and add it to the taskList array list
                                break;
                            case 2:
                                //Logic goes here to create a new work task and add it to the taskList array list
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
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Thank you for using Taskarella, we hope to see you again!");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 5);

        scanner.close();

    }
}