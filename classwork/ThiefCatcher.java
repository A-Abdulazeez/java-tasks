import java.util.Scanner;

public class ThiefCatcher{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

String userChoice = "";
while (true){
System.out.print("Any thief yet: ");
userChoice = input.next();
if (userChoice.equalsIgnoreCase("cat")) break;

}
System.out.println(userChoice);
}
}
