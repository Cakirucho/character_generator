import java.io.BufferedReader;
import java.io.IOException;

public class CharacterBuilder {
    private Character character;

    CharacterBuilder() { }

    public Character getCharacter() {
        return character;
    }

    public void initNewCharacter(BufferedReader reader) throws IOException {
        System.out.println("Give a first name to our new character:");
        String firstName = reader.readLine();

        System.out.println("Give a last name to our new character:");
        String lastName = reader.readLine();

        System.out.println("Give age to our new character:");
        int age = Integer.parseInt(reader.readLine());

        character = new Character(firstName, lastName, age);
        System.out.println(firstName + " was created!!\n");
    }
}
