import java.util.Scanner;

public class Taxcollector{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Enter your monthly salary in ₦");
double salary = input.nextDouble();

double annualsalary = salary*12;
double tax = 0;


if (salary<=300000){
tax = 0;
}
else if (salary>300000 && salary<600001){
tax = (annualsalary - 300000 ) * 0.15;
}
else if (salary>600000){
tax = (annualsalary - 600000 ) * 0.25;
}

System.out.printf("your annual salary is %.2f%n", salary);
System.out.printf("your tax owed is %.2f%n", tax);

}
}
 

