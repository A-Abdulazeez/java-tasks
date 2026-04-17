import java.util.Scanner;

public class TaskSix{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

int scoreInput = 1;
int sum = 0;
int count = 0;
double average = 0;
while(scoreInput <=10){
scoreInput++;

System.out.print("Enter Score: ");
int scoreCollector = input.nextInt();

if(scoreCollector % 2 == 0){
sum += scoreCollector;
count += 1;
average = sum/count;
}
}

System.out.println("the average is " + average);
}


    
    
 

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}   






