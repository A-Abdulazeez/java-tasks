import java.util.Scanner;

public class TaskTwo{
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

sum += scoreCollector;
count += 1;
average = sum/count;
}

System.out.println("The average is " + average);
}


    
    
 

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}   






