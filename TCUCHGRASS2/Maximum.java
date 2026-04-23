public class Maximum{
public static int max(int numberOne, int numberTwo) {
if (numberOne > numberTwo) {
return numberOne;
}
else {
return numberTwo;
}
}
    
public static void main (String[]args){
Maximum findnumber = new Maximum();
int result = findnumber.max(100,50);
System.out.println("The maximum number is " + result);


}
}
