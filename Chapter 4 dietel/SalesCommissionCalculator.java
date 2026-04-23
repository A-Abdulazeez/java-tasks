import java.util.Scanner;

public class SalesCommissionCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

double totalSales = 0.0;
int item;
String itemMenu = """
Items:
1 = 239.99
2 = 129.75
3 = 99.95
4 = 350.89
""";
System.out.println(itemMenu);

System.out.print("Enter item number sold (0 to end): ");
item = input.nextInt();

while (item != 0) {
switch (item) {
case 1:
totalSales += 239.99;
break;
case 2:
totalSales += 129.75;
break;
case 3:
totalSales += 99.95;
break;
case 4:
totalSales += 350.89;
break;
default:
System.out.println("Invalid item number");
}

System.out.print("Enter item number sold (0 to end): ");
item = input.nextInt();
}

double earnings = 200 + (0.09 * totalSales);

System.out.printf("Total sales: $%.2f%n", totalSales);
System.out.printf("Weekly earnings: $%.2f%n", earnings);
    }
}
