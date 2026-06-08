import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SmallMathApp2Test{

@Test
public void testThatPlusOperatorWorks(){
SmallMathApp2 myMathApp = new SmallMathApp2();
double firstNumber = 10;
double secondNumber = 5;
myMathApp.sum();
assertEquals(15.0, myMathApp.operation('+'));
}

@Test
public void testThatsMinusOperatorWorks(){
SmallMathApp2 myMathApp = new SmallMathApp2();
double firstNumber = 10;
double secondNumber = 5;
myMathApp.subtract();
assertEquals(5.0, myMathApp.operation('-'));
}

@Test
public void testThatMultiplyOperatorWorks(){
SmallMathApp2 myMathApp = new SmallMathApp2();
double firstNumber = 10;
double secondNumber = 5;
myMathApp.multiply();
assertEquals(50.0, myMathApp.operation('*'));
}

@Test
public void testThatDivideOperatorWorks(){
SmallMathApp2 myMathApp = new SmallMathApp2();
double firstNumber = 10;
double secondNumber = 5;
myMathApp.divide();
assertEquals(2.0, myMathApp.operation('/'));
}

}