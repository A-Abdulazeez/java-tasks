import java.util.Scanner;

public class Tasktwentysix{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("What is your name");
String name = input.nextLine();

System.out.println("What is your age");
int age = input.nextInt();


System.out.printf("I am %s, and i am %d years old", name,age);

}
}
