import java.util.Scanner;

public class StarSign{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.print("Enter number of star: ");
int numberOfStar = input.nextInt();

for (int rowStarSign = 1; rowStarSign<=numberOfStar;rowStarSign++){
for (int columnStarSign = 1; columnStarSign<=rowStarSign;columnStarSign++){

System.out.print("*");
}

System.out.println();
}



}
}


