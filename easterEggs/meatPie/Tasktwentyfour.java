import java.util.Scanner;

public class Tasktwentyfour{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter your first number");
int x = input.nextInt();

System.out.println("Enter your second number");
int y = input.nextInt();

int temp = x;
x = y;
y = temp;

System.out.println(x +" "+ y);

}
}
