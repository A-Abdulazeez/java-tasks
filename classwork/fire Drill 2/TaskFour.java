import java.util.Scanner;

public class TaskFour{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

int sum = 0;
int scoreInput = 1;
while(scoreInput <=10){
scoreInput++;

System.out.print("Enter Score: ");
int scoreCollector = input.nextInt();

if (scoreInput == 2 || scoreInput == 4 || scoreInput == 10) {

}
sum += scoreCollector;

}

System.out.println(sum);
}
}
