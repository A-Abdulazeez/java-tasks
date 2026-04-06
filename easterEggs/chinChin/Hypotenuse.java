import java.util.Scanner;

public class Hypotenuse{
public static void main (String[] args){
Scanner input = new Scanner(System.in);


System.out.println("Enter your opposite");
int opposite = input.nextInt();

System.out.println("Enter your adjacent");
int adjacent = input.nextInt();

// hyp=opp^2*adj^2
int oppositesqr = opposite * opposite;  
int adjacentsqr = adjacent + adjacent;

int hyp = oppositesqr + adjacentsqr;

System.out.printf("The Hypotenuse is %d%n", hyp);

}
}
