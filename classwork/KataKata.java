import java.util.Scanner;

public class KataKata{
public static void main(String... args){
Scanner input = new Scanner(System.in);
int [] listOfArray = new int[10];

int counter = 1;
for (;counter < 10;) {
System.out.printf("Enter a number %d: ", counter);
listOfArray[counter] = input.nextInt();
counter++;
}

for (int number = 1; number < listOfArray.length; number++){ 
System.out.print(listOfArray[number] + " ");
}
}
}
