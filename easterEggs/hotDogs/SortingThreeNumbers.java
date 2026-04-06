import java.util.Scanner;

public class SortingThreeNumbers{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter first number");
int a = input.nextInt();

System.out.println("Enter second number");
int b = input.nextInt();

System.out.println("Enter third number");
int c = input.nextInt();

int smallest = 0, middle = 0, biggest = 0;

if (a <= b && a <= c) {
smallest = a;
if (b <= c){
middle = b;
biggest = c;
} 
else {
middle = c;
biggest = b;
}
} 

else if (b <= a && b <= c){
smallest = b;
if (a <= c) {
middle = a;
biggest = c;
} 
else {
middle = c;
biggest = a;
}
} 

else if (c <= a && c <= b){
smallest = c;
if (a <= b) {
middle = a;
biggest = b;
} 
else {
middle = b;
biggest = a;

}
}

System.out.println("Sorted order from smllest to biggest: " + smallest + " " + middle + " " + biggest);
    
}
}
