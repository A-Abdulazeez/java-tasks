import java.util.Scanner;

public class TelephoneKeypad{
public static void main(String[]args){
Scanner input = new Scanner(System.in);


System.out.println("Enter your userInput");
char userInput = input.next().toLowerCase().charAt(0);

if (!Character.isLetter(userInput)){
System.out.println("invalid");
}
else {

if (userInput == 'a' || userInput == 'b' || userInput == 'c'){
System.out.println(2);
 }
else if (userInput == 'd' || userInput == 'e' || userInput == 'f') {
System.out.println(3);
            } 
else if (userInput == 'g' || userInput == 'h' || userInput == 'i') {
System.out.println(4);
            } 
else if (userInput == 'j' || userInput == 'k' || userInput == 'l') {
System.out.println(5);
            } 
else if (userInput == 'm' || userInput == 'n' || userInput == 'o') {
System.out.println(6);
              } 
else if (userInput == 'p' || userInput == 'q' || userInput == 'r' || userInput == 's') {
System.out.println(7);
            } 
else if (userInput == 't' || userInput == 'u' || userInput == 'v') {
System.out.println(8);
            } 
else if (userInput == 'w' || userInput == 'x' || userInput == 'y' || userInput == 'z') {
System.out.println(9);


}

}
}
}