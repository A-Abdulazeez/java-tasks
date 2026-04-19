import java.util.Scanner;

public class Countdown{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter a number to begin your countdown");
int numberInput = input.nextInt();

while(numberInput > 0){
numberInput -= 1;

System.out.println(numberInput);
}

System.out.println("Blast off !");


}
}
