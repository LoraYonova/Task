import java.util.HashMap;
import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Моля, въведете низ: ");
        String input = scanner.nextLine();
        scanner.close();

        input = input.trim();
        String[] words = input.split("\\s+");
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        System.out.println("Брой на думите в низа:");

        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}
