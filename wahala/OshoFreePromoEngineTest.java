import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OshoFreePromoEngineTest{

    @Test
    public void testThatgetTotalReturnsWithNoDiscountWhencartTotalIs4000withPromoCode(){

        double cartTotal = 4000.00;
        String promoCode = "STARTER10";
        double actual =  OshoFreePromoEngine.promoEngine(cartTotal, promoCode);
        double expected = 4000.00;
        
        assertEquals(expected, actual);
    }

    @Test
    public void testThatgetTotalReturnsNormalCartTotalWhenPromoCodeIsInvalid(){

        double cartTotal = 4000;
        String promoCode = "ABDULAZEEZ";
        double actual =   OshoFreePromoEngine.promoEngine(cartTotal, promoCode);
        double expected = 4000.00;
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testThatgetTotalReturns4500IfCartTotalIs5000andPromoCodeOfSTARTER10(){

        double cartTotal = 5000.00;
        String promoCode  ="STARTER10";
        double actual = OshoFreePromoEngine.promoEngine(cartTotal, promoCode);
        double expected = 4500.00;

        assertEquals(expected, actual);
    }

    @Test
    public void testThatgetTotalReturns12000IfCartTotalIs15000andPromoCodeOfBIGBOY20(){

        double cartTotal = 15000;
        String promoCode  ="BIGBOY20";
        double actual = OshoFreePromoEngine.promoEngine(cartTotal, promoCode);
        double expected = 12000;

        assertEquals(expected, actual);
    }

     @Test
    public void testThatgetTotalReturns19500IfCartTotalIs30000andPromoCodeOfOSHOFREE35(){

        double cartTotal = 30000;
        String promoCode ="OSHOFREE35";
        double actual = OshoFreePromoEngine.promoEngine(cartTotal, promoCode);
        double expected = 19500;

        assertEquals(expected, actual);
    }

}