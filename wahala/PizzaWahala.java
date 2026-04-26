import java.util.Scanner;

public class PizzaWahala {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter number of people: ");
int numberOfPeople = input.nextInt();

System.out.print("""
               Pizza Type
            1.  SAPA SIZE
            2.  SMALL MONEY
            3.  BIG BOYS
            4.  ODOGWU
            """);
int pizzaType = input.nextInt();

int slicesPerBox = 0;
int pricePerBox = 0;

switch (pizzaType) {
case 1 :
slicesPerBox = 4;
pricePerBox = 2500;
 break;

case 2:
slicesPerBox = 6;
pricePerBox = 2900;
 break;

case 3:
slicesPerBox = 8;
pricePerBox = 4000;
 break;

case 4:
slicesPerBox = 12;
pricePerBox = 5200;
break;

default:
System.out.println("Invalid pizza type");
 return;
 }

int numberOfBoxes = numberOfPeople / slicesPerBox;

if (numberOfPeople % slicesPerBox != 0) {
numberOfBoxes++;
}

int totalSlices = numberOfBoxes * slicesPerBox;
int leftOverSlices = totalSlices - numberOfPeople;
int totalPrice = numberOfBoxes * pricePerBox;

System.out.println("Number of boxes of pizza to buy = " + numberOfBoxes + " boxes");
System.out.println("Number left over slices after serving = " + leftOverSlices + " slices");
System.out.println("Price = " + totalPrice);

}
}
