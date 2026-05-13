public class OshoFreePromoEngine{
public static double promoEngine(double cartTotal, String promoCode){

double total = 0;
double discount = 0;

if (promoCode != "STARTER10" || promoCode != "BIGBOY20" || promoCode !="OSHOFREE35") {
total = cartTotal;
}

if (cartTotal < 5000 && promoCode == "STARTER10"){
discount = 0;
total = cartTotal - discount;
}
else if (cartTotal == 5000 && cartTotal <= 14999 && promoCode == "STARTER10"){
discount = 10/100 * cartTotal;
total = cartTotal - discount;
}
else if (cartTotal == 15000 && cartTotal <= 29999 && promoCode == "BIGBOY20"){
discount = 20/100 * cartTotal;
total = cartTotal - discount;
}
else if (cartTotal >= 30000 && promoCode == "OSHOFREE35"){
discount = 35/100 * cartTotal;
total = cartTotal - discount;
}
return total;
}

}