import java.util.Scanner;

public class get_verbs {

    public static void main(String[] args) {
        // Set up scanner and call method to get user's verb input
        Scanner scanner = new Scanner(System.in);
        String verb = get_verb(scanner);

        System.out.println("You entered the verb: " + verb);
        scanner.close();
    }

    // Prompts user to enter a verb and then returns their response as text
    public static String get_verb(Scanner scanner) {
        System.out.print("Enter a verb: ");
        String verbInput = scanner.nextLine();
        return verbInput;
    }
}
