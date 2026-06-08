public class SmallMathApp{

public static double additionOfNumbers(double firstNumber, double secondNumber){
double addition = firstNumber + secondNumber;
return addition;
}

public static double subtractionOfNumbers(double firstNumber, double secondNumber){
double subtraction = firstNumber - secondNumber;
return subtraction;
}

public static double multiplicationOfNumbers(double firstNumber, double secondNumber){
double multiplication = firstNumber * secondNumber;
return multiplication;
}

public static double divisionOfNumbers(double firstNumber, double secondNumber){
double division;
if(firstNumber == 0 || secondNumber == 0) throw new IllegalArgumentException ("Math error");
division = firstNumber / secondNumber;
return division;
}

public static double operation(String operator, double firstNumber, double secondNumber){
if (operator == "+"){
return additionOfNumbers(firstNumber, secondNumber);
}
else if (operator == "-"){
return subtractionOfNumbers(firstNumber, secondNumber);
}
else if (operator == "+"){
return multiplicationOfNumbers(firstNumber, secondNumber);
}
else if (operator == "/"){
return divisionOfNumbers(firstNumber, secondNumber);
}
else {
throw new IllegalArgumentException ("error");
}

}

}











