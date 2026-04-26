public class BackToSender{
public static int CalculatePayment(int numberOfSales){

int TotalNumberOfSales = 100;
int riderPayment = 0;

if (numberOfSales < 50){
riderPayment =  numberOfSales * 160 + 5000;
}

else if (numberOfSales >= 50 && numberOfSales <= 59){
riderPayment =  numberOfSales * 200 + 5000;
}

else if (numberOfSales >= 60 && numberOfSales <= 69){
riderPayment =  numberOfSales * 250 + 5000;
}

else if (numberOfSales >= 70){
riderPayment =  numberOfSales * 500 + 5000;
}

return riderPayment;
}

public static void main(String... args){

System.out.println(CalculatePayment(25));
System.out.println(CalculatePayment(80));
}
}
