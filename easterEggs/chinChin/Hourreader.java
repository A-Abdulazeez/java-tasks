import java.util.Scanner;

public class Hourreader{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter your current hour");
int hour = input.nextInt();

if(hour == 5 && hour < 12){
System.out.println("Good morning");
}

else if (hour >=12 && hour <18){
System.out.println("Good afternoon");
}

else if (hour >=18 && hour <22){
System.out.println("Good evening");
}

else if (hour >=22 && hour <4){
System.out.println("Hot");
}

}
}
