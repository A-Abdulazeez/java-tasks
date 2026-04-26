import java.util.Scanner;

public class InvertedStarSign{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.print("Enter number of star: ");
int numberOfStar = input.nextInt();

for (int rowStarSign = 1; rowStarSign<=numberOfStar;rowStarSign++){
for (int columnStarSign = numberOfStar; columnStarSign>=1;columnStarSign--){
if (rowStarSign >= columnStarSign){
System.out.print(" *");
}
else{
System.out.print(" ");
}

}
System.out.println();
}

}

}



