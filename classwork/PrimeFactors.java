import java.util.Scanner;

public class PrimeFactors{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
        
System.out.println("Enter a number: ");
int userNumber = input.nextInt();
int total = 0;
int count = 2;
        
while(count <= userNumber){  
if(userNumber % count == 0){
userNumber = userNumber/count;
total+=count;
} 
else{
count++;
 }        
}
System.out.println(total);
        
        
}
}
