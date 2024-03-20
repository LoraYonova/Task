import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharacters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Моля, въведете низ: ");
        String input = scanner.nextLine();
        scanner.close();

        Set<Character> uniqueChar = new HashSet<>();
        Set<Character> duplicateChar = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);

            if (!uniqueChar.contains(current)) {
                uniqueChar.add(current);
            } else {
                duplicateChar.add(current);
            }
        }

        for (Character c : duplicateChar) {
            System.out.print(c + " ");
        }

    }
}
