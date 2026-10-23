import java.util.Scanner;

public class BurgerRunner {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Call the static method directly using: ClassName.methodName(arguments)
        String verb1 = get_verbs.get_verb(scanner);
        String place1 = get_places.get_place(scanner);
        String place2 = get_places.get_place(scanner);

        scanner.close();

        String story = "Once upon a time in " + place1 + ", the city above " + place2 + ", there were a bunch of " + adjective1 + " " + noun1 + ". Then, there came a " + adjective2 + " burger. His main goal was to [verb] the world.";
        System.out.print(story);
    }
}
