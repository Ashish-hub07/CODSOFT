import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int wordCount = input.split("\\s+").length;
        int charCount = input.length();

        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of characters: " + charCount);
    }
}

