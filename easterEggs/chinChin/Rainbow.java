import java.util.Random;

public class Rainbow{
public static void main(String[]args){
Random input = new Random();

int x = input.nextInt(7)+1;

if(x == 1){
System.out.println("VIOLET");
}

else if(x == 2){
System.out.println("INDIGO");
}

else if(x == 3){
System.out.println("BLUE");
}

else if(x == 4){
System.out.println("GREEN");
}

else if(x == 5){
System.out.println("YELLOW");
}

else if(x == 6){
System.out.println("ORANGE");
}

else if(x == 7){
System.out.println("RED");
}

}
}
