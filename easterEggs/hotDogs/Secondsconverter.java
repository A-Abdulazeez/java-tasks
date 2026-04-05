import java.util.Scanner;

public class Secondsconverter{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter a number in seconds");
int seconds = input.nextInt();

int hour = seconds/3600;

int minute = (seconds % 3600) /60;

int remainingseconds = (seconds % 3600) % 60;

System.out.printf("%d hour, %d minutes, %d seconds%n", hour,minute,remainingseconds);

}
}

