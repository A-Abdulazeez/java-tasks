import java.util.Scanner;

public class Threenum{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter a number");
int number = input.nextInt();

if(number >= 100 && number<= 999){
System.out.println("you entered a three digit number");
}

else{
System.out.println("you entered a non-three digit number");
}

}
}
