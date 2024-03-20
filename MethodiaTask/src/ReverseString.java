import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Моля, въведете низ: ");
        String[] input = scan.nextLine().split(" ");

        for (int i = 0; i < input.length / 2; i++) {
            String temp = input[i];
            input[i] = input[input.length - i - 1];
            input[input.length - i - 1] = temp;

        }
        System.out.println(String.join(" ", input));
    }
}