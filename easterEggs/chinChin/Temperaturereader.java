import java.util.Scanner;

public class Temperaturereader{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter your temperature in °C");
int temp = input.nextInt();

if(temp < 0){
System.out.println("Freezing");
}

else if (temp >=0 && temp <16){
System.out.println("Cold");
}

else if (temp >=16 && temp <26){
System.out.println("Warm");
}

else if (temp >=26 && temp <1000){
System.out.println("Hot");
}

}
}
