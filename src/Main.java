import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final int EXIT_MENU = 0;
    private static final int NEW_CHARACTER = 1;
    private static final int AVAILABLE_CHARACTERS = 2;
    private static final int DEFAULT_OPTION = 999;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CharacterBuilder characterBuilder = new CharacterBuilder();

        int option = DEFAULT_OPTION;
        while (option != EXIT_MENU) {
            switch (option) {
                case NEW_CHARACTER:
                    characterBuilder.initNewCharacter(reader);
                    break;
                case AVAILABLE_CHARACTERS:
                    Character character = characterBuilder.getCharacter();
                    printAvailableCharacters(character);
                default:
                    System.out.println("***Welcome to character builder!!***\n");
                    break;
            }

            availableOptions();
            option = Integer.parseInt(reader.readLine());
        }

        System.out.println("See you next time :)");
    }

    private static void availableOptions() {
        System.out.println("Available options:");
        System.out.println("1. New Character");
        System.out.println("2. Available Characters");
        System.out.println("0. Exit program!");
    }

    private static void printAvailableCharacters(Character character) {
        if (character != null) {
            System.out.println(character.toString() + "\n");
        } else {
            System.out.println("There are no available characters!! Make a new one.\n");
        }
    }
}
