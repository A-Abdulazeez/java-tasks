import java.util.Scanner;

public class TaskTen{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

double scoreInput = 1;
double sum = 0;
double count = 0;
double average = 0;
while(scoreInput <=10){
scoreInput++;

System.out.print("Enter Score: ");
int scoreCollector = input.nextInt();

if(scoreCollector > 0 && scoreCollector < 100){
sum += scoreCollector;
count += 1;
average = sum/count;
}

}

System.out.println("The average is " + average);
}
}

