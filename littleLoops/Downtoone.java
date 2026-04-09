import java.util.Scanner;

public class Downtoone {
public static void main (String[] args) {
Scanner inputCollector = new Scanner(System.in);


System.out.println("Enter your number!");
int userValue = inputCollector.nextInt();

for (int i = userValue; i >=1; i--) System.out.println(i);

}
}
