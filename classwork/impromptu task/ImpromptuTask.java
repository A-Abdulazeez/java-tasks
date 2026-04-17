import java.util.Scanner;

public class ImpromptuTask{
public static void main(String[]args){
Scanner input = new Scanner(System.in);


System.out.println("Enter your number boss: ");
int numberInput = input.nextInt();
int sum = 0;

while(numberInput > 0){
int lastNumber = numberInput % 10;
numberInput = numberInput / 10;



//sum += lastNumber;

System.out.println(lastNumber);
//System.out.print(sum);

}


}
}
