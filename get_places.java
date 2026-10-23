public class get_places
{
    {
        Scanner scanner = new Scanner(System.in);
        String verb = get_place(scanner);
        System.out.println("You entered the place: " + place);
        scanner.close();
    }

    public static String get_place(Scanner scanner)
    {
        System.out.print("Enter a place: ");
        String placeInput = scanner.nextLine();
        return placeInput;
    }
}