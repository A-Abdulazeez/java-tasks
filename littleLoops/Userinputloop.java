import java.util.Scanner;

public class Userinputloop {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int num = input.nextInt();

int i = 1;
int sum = 0;

while (i <= num) {
sum = sum + i;
i++;
}

System.out.println("Sum = " + sum);
}
}
