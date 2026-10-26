import java.util.Scanner; 

public class get_nouns {
    public static void main(String[] args) {
        //Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        
        //Call the get_noun method and save the returned text into a String
        String noun = get_noun(scanner);
        
        //Print the result 
        System.out.println("You entered the noun: " + noun);
        
        scanner.close();
    }

    //Prompts the user and capture a line of text
    public static String get_noun(Scanner scanner) {
        //Display prompt to the user
        System.out.print("Enter a noun: "); 
        String nounInput = scanner.nextLine();
        
        //Return the typed string back to the main
        return nounInput; 
    }
}
