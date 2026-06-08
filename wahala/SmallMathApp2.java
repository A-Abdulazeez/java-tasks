public class SmallMathApp2{

double firstNumber = 10;
double secondNumber = 5;


public double operation(char operator){
if (operator == '+'){
return sum();
}
else if (operator == '-'){
return subtract();
}
else if (operator == '*'){
return multiply();
}
else if (operator == '/'){
return divide();
}
else {
throw new IllegalArgumentException ("error");
}

}


public double sum(){
double sumof = firstNumber + secondNumber;
return sumof;
}
public double subtract(){
double subtractof = firstNumber - secondNumber;
return subtractof;
}
public double multiply(){
double multiplyof = firstNumber * secondNumber;
return multiplyof;
}
public double divide(){
double divisionof = firstNumber / secondNumber;
return divisionof;
}

}
