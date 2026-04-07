import java.util.Scanner;

public class Agequalification{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter your age Sir/ma");
int age = input.nextInt();

if (age >=65){
System.out.println("You are qualified for a senior citizen discount");
}

else if(age <65){
System.out.println("You are not qualified for a senior citizen discount");
}

}
}

