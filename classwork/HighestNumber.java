public class HighestNumber{
public static int LargestNumberOf(int firstNumber,int secondNumber,int thirdNumber){
int LargestNumber = firstNumber;
if (secondNumber > thirdNumber){
LargestNumber = secondNumber;
}
if (thirdNumber >  secondNumber){
LargestNumber = thirdNumber;
}
return LargestNumber;
}

public static void main(String... args){

System.out.println(LargestNumberOf(1,2,3));
}
}

