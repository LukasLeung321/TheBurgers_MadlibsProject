import java.util.Scanner; // scanner imported so input from the keyboard can be read 

public class get_numbers {

    public static void main(String[] args) {
        // create a scanner that reads from input 
        Scanner scanner = new Scanner(System.in);
        
        // call get_number() to prompt the user and store what they typed
        String number = get_number(scanner);
        
        // print back the value the user entered
        System.out.println("You entered the number: " + number);

        // close scanner 
        scanner.close();
    }

   //
    public static String get_number(Scanner scanner) {
        // ask the user for input 
        System.out.print("Enter a number: ");

        // read the whole line the user types
        String numberInput = scanner.nextLine();

        // send the input back to the caller
        return numberInput;
    }
}
