import java.util.Scanner;

public class TaskFive{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

int scoreInput = 1;
int sum = 0;

while(scoreInput <=10){
scoreInput++;

System.out.print("Enter Score: ");
int scoreCollector = input.nextInt();

if(scoreCollector % 2 == 0){
sum += scoreCollector;

}
}
System.out.println("the sum is " + sum);

}


    
    
 

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}   






