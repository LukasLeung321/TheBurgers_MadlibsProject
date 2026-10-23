import java.util.Scanner;

public class BurgerRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Call the static method directly using: ClassName.methodName(arguments)
        String verb = get_verbs.get_verb(scanner);

        System.out.println("Verb received in Main: " + verb);

        scanner.close();
    }
}
