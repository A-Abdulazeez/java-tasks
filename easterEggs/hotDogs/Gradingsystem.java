import java.util.Scanner;

public class Gradingsystem{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter your score my guy:");
int score = input.nextInt();

if(score >= 90 && score <= 100){
System.out.println("Grade A");
}

else if( score >= 80 && score <= 89){
System.out.println("Grade B");
}

else if( score >= 70 && score <= 79){
System.out.println("Grade C");
}

else if( score >= 60 && score <= 69){
System.out.println("Grade D");
}

else if( score >= 0 && score <= 59){
System.out.println("Grade F");
}

}
}
