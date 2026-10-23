import java.util.Scanner;

public class get_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Call the updated method to get a number
        String number = get_number(scanner);
        
        System.out.println("You entered the number: " + number);
        scanner.close();
    }

    public static String get_number(Scanner scanner) {
        System.out.print("Enter a number: ");
        String numberInput = scanner.nextLine();
        return numberInput;
    }
}
 
    

