import java.util.Scanner;

public class ReverseNumber{
public static void main(String[]args){
Scanner input = new Scanner(System.in);


System.out.println("Enter your number: ");
int numberInput = input.nextInt();
int sum = 0;

while(numberInput > 0){
int lastNumber = numberInput % 10;
numberInput = numberInput / 10;

System.out.print(lastNumber);
}

}
}

