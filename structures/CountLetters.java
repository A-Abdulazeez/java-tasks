import java.util.Scanner;

public class CountLetters {
    public static int countLetters(String s) {
        int count = 0;

        for (int index = 0; index < s.length(); index++) {
            if (Character.isLetter(s.charAt(index))) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        System.out.println("The number of letters is " + countLetters(text));
    }
}
