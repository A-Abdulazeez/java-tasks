import java.util.Scanner;

public class TaskEight{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

int scoreInput = 1;
int sum = 0;

while(scoreInput <=10){
scoreInput++;

System.out.print("Enter Score: ");
int scoreCollector = input.nextInt();

if(scoreCollector > 0 && scoreCollector < 100){
sum += scoreCollector;
}

}

System.out.println("The Sum is " + sum);
}
}

