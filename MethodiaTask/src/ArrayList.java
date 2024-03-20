import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class ArrayList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Моля, въведете низ: ");
        List<String> arrays = Arrays.stream(scan.nextLine().split(" ")).toList();

        for (String array : arrays) {
            System.out.print(array + " ");
        }
    }
}
