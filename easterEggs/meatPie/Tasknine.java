import java.util.Scanner;

public class Tasknine{
public static void main(String[]args){
Scanner Pickcolor = new Scanner(System.in);

System.out.println("Whats is your favourite color");
String usercolor = Pickcolor.nextLine();


System.out.printf("Your favourite color is %s%n", usercolor);

}
}
