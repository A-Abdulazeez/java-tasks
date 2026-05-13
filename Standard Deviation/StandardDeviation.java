public class StandardDeviation{

public static double sumOfNumbers(double [] number){
double sumOfNumber = 0;
int index = 0;
for (; index < number.length; index++){
sumOfNumber += number[index];
}
return sumOfNumber;
}

public static double meanOfNumbers(double [] number){
int count = 0;
double sumOfNumber = sumOfNumbers(number);
double meanOfNumber = 0;
int index = 0;
for (; index < number.length; index++){
count += 1;
meanOfNumber = sumOfNumber / count;
}
return meanOfNumber;
}

public static double totalMeanDeviation(double [] number){
double meanOfNumber = meanOfNumbers(number);
double sumMeanDeviationOfNumber = 0;
for (double value : number){
double differenceInNumberAndMean = value - meanOfNumber;
sumMeanDeviationOfNumber += differenceInNumberAndMean * differenceInNumberAndMean;
}
return sumMeanDeviationOfNumber;
}

public static double variance(double [] number){
int count = 0;
double meanDeviationOfNumber = totalMeanDeviation(number);
double variance = 0;
int index = 0;
for (; index < number.length; index++){
count += 1;
variance = meanDeviationOfNumber / count;
}
return variance;
}

public static double standardDeviation(double [] number){
double varianceOfNumber = variance(number);
double standardDeviation = Math.sqrt(varianceOfNumber);
return standardDeviation;
}

public static void main(String[] args){
double [] number = {2,4,4,4,5,5,7,9};
System.out.println("Standard Deviation is: " + standardDeviation(number));

}

}