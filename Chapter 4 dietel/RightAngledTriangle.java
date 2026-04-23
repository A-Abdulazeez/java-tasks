import java.util.Scanner;

public class RightAngledTriangle {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter baseLength length (1-10): ");
int baseLength = input.nextInt();

if (baseLength < 1 || baseLength > 10) {
System.out.println("Invalid baseLength length.");
} 
else {
int rowOfTriangle = 1;

while (rowOfTriangle <= baseLength) {
int columnOfTriangle = 1;

while (columnOfTriangle <= rowOfTriangle) {
System.out.print("*");
columnOfTriangle++;
}

System.out.println();
rowOfTriangle++;
}
}
}
}
