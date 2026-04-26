import java.util.Scanner;

public class Stars{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter number of star: ");
int numberOfStar = input.nextInt();

int firstDigit = 1;
for (; firstDigit <= numberOfStar; firstDigit++) {
for (int secondDigit = 1; secondDigit <= firstDigit; secondDigit++) {


System.out.print("*");
}

System.out.println();
}

int thirdDigit = numberOfStar - 1;
for (; thirdDigit >= 1; thirdDigit--) {
for (int forthDigit = 1; forthDigit <= thirdDigit; forthDigit++) {


System.out.print("*");
}

System.out.println();
}
}
}	
