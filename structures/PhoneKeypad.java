import java.util.Scanner;

public class PhoneKeypad {
    public static int getNumber(char uppercaseLetter) {
        if (uppercaseLetter >= 'A' && uppercaseLetter <= 'C') {
            return 2;
        } else if (uppercaseLetter >= 'D' && uppercaseLetter <= 'F') {
            return 3;
        } else if (uppercaseLetter >= 'G' && uppercaseLetter <= 'I') {
            return 4;
        } else if (uppercaseLetter >= 'J' && uppercaseLetter <= 'L') {
            return 5;
        } else if (uppercaseLetter >= 'M' && uppercaseLetter <= 'O') {
            return 6;
        } else if (uppercaseLetter >= 'P' && uppercaseLetter <= 'S') {
            return 7;
        } else if (uppercaseLetter >= 'T' && uppercaseLetter <= 'V') {
            return 8;
        } else if (uppercaseLetter >= 'W' && uppercaseLetter <= 'Z') {
            return 9;
        }

        return uppercaseLetter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a phone number string: ");
        String phoneNumber = input.nextLine();

        for (int index = 0; index < phoneNumber.length(); index++) {
            char character = Character.toUpperCase(phoneNumber.charAt(index));

            if (Character.isLetter(character)) {
                System.out.print(getNumber(character));
            } else {
                System.out.print(phoneNumber.charAt(index));
            }
        }

        System.out.println();
    }
}
