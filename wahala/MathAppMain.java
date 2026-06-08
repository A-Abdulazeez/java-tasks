import java.util.Scanner;

public class MathAppMain{
public static void main(String... args){
Scanner input = new Scanner(System.in);

while(true){
System.out.print("""

============= MINI CALCULATOR =============
1. +
2. -
3. *
4. /
""");

System.out.println("Enter 0 to exit");
int userInput = input.nextInt();

if (userInput == 0) break;
}

}
}