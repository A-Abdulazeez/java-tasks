import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StandardDeviationTest{

@Test
public void testThatSumOfNumbersWorks(){
double [] number = {2,4,4,4,5,5,7,9};

double result = StandardDeviation.sumOfNumbers(number);

assertEquals(40.0, result);
}

@Test
public void testThatMeanOfNumbersWorks(){
double [] number = {2,4,4,4,5,5,7,9};

double result = StandardDeviation.meanOfNumbers(number);

assertEquals(5.0, result);
}

@Test
public void testThatTotalMeanDeviationWorks(){
double [] number = {2,4,4,4,5,5,7,9};

double result = StandardDeviation.totalMeanDeviation(number);

assertEquals(32.0, result);
}

@Test
public void testThatVarianceWorks(){
double [] number = {2,4,4,4,5,5,7,9};

double result = StandardDeviation.variance(number);

assertEquals(4.0, result);
}

@Test
public void testThatStandardDeviationWorks(){
double [] number = {2,4,4,4,5,5,7,9};

double result = StandardDeviation.standardDeviation(number);

assertEquals(2.0, result);
}

}