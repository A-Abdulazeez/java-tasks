import java.util.Scanner;
 
public class Subtraction{
public static int subtract(int numberOne, int numberTwo) {
if (numberOne > numberTwo) {
return numberOne - numberTwo;
} 
else {
return numberTwo - numberOne;
}
}

public static void main (String[]args){
Scanner input = new Scanner(System.in);


System.out.println("Enter a number");
int numberOne = input.nextInt();

System.out.println("Enter a number");
int numberTwo = input.nextInt();

Subtraction result = new Subtraction();
int mainResult = result.subtract(int numberOne ,int numberTwo);

System.out.println(mainResult);
}
}
