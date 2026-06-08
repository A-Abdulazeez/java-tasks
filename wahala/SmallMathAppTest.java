import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SmallMathAppTest{

@Test
public void testThatSumOfNumbersWorks(){
double firstNumber = 3;
double secondNumber = 3;
double result = SmallMathApp.additionOfNumbers(firstNumber,secondNumber);
assertEquals(6.0, result);
}

@Test
public void testThatSubtractionOfNumbersWorks(){
double firstNumber = 3;
double secondNumber = 3;
double result = SmallMathApp.subtractionOfNumbers(firstNumber,secondNumber);
assertEquals(0.0, result);
}

@Test
public void testThatMultiplicationOfNumbersWorks(){
double firstNumber = 3;
double secondNumber = 3;
double result = SmallMathApp.multiplicationOfNumbers(firstNumber,secondNumber);
assertEquals(9.0, result);
}

@Test
public void testThatDivisionOfNumbersWorks(){
double firstNumber = 3;
double secondNumber = 3;
double result = SmallMathApp.divisionOfNumbers(firstNumber,secondNumber);
assertEquals(1.0, result);
}

@Test
public void testThatDivisionOfSecondNumbersByZeroThrowsException(){
double firstNumber = 0;
double secondNumber = 3;
assertThrows(IllegalArgumentException.class, ()-> SmallMathApp.divisionOfNumbers(firstNumber,secondNumber));
}

@Test
public void testThatDivisionOfFirstNumbersByZeroThrowsException(){
double firstNumber = 5;
double secondNumber = 0;
assertThrows(IllegalArgumentException.class, ()-> SmallMathApp.divisionOfNumbers(firstNumber,secondNumber));
}

@Test
public void testThatOperatorWorks(){
double firstNumber = 3;
double secondNumber = 3;
String operator = "+";
double result = SmallMathApp.operation(operator,firstNumber,secondNumber);
assertEquals(6.0, result);
}
}