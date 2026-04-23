import java.util.Scanner;

public class IsEvenInteger{
public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
}
else {
  return false;
 }
 }
 
public static void main (String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter a number");
int numberInput = input.nextInt();

IsEvenInteger evenNumber = new IsEvenInteger();
boolean result = evenNumber.isEven(numberInput);
System.out.println(numberInput + " is " + result);
}
}
