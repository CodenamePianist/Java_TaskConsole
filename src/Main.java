import java.lang.reflect.Array;
import java.util.List;
import java.util.Random;

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

        String assistant = randomName(managerNames);
        System.out.println("Welcome to Taskarella, your personal task manager! I'm " + assistant + ", your personal assistant. How can I help you today?" );

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}