import java.util.Scanner;

public class get_nouns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String noun = get_noun(scanner);
        System.out.println("You entered the noun: " + noun);
        scanner.close();
    }

    public static String get_noun(Scanner scanner) {
        System.out.print("Enter a noun: ");
        String nounInput = scanner.nextLine();
        return nounInput;
    }
}
