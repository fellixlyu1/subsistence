import java.util.Scanner;

public class Characters {
    public String characterSelection;

    public Characters(String characterSelection) {
        this.characterSelection = characterSelection;
    }

    public String getCharacter() {
        return characterSelection;
    }

    public static Characters[] characters() {
        Characters skylar = new Characters("Skylar");
        Characters riley = new Characters("Riley");
        Characters amy = new Characters("Amy");
        Characters amos = new Characters("Amos");
        Characters cassidy = new Characters("Cassidy");
        Characters jodi = new Characters("Jodi");
        Characters kragler = new Characters("Kragler");
        Characters zelroy = new Characters("Zelroy");
        Characters bibidi = new Characters("Bibidi");
        Characters zebidi = new Characters("Zebidi");
        return new Characters[]{skylar, riley, amy, amos, cassidy, jodi, kragler, zelroy, bibidi, zebidi};
    }

    public static void main(String[] args) {
        Characters[] characterList = characters();
        System.out.println("Choose a character: ");
        for (int i = 0; i < characterList.length; i++) {
            System.out.println((i + 1) + ". " + characterList[i].getCharacter());
        }

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= characterList.length) {
            System.out.println(characterList[choice - 1].getCharacter() + " selected");
        } else {
            System.out.println("Character not selected");
        }
    }
}
