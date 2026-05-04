import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeNumberTest {
    @Test
    public void testIsPrime() {
        assertTrue(PrimeNumber.isPrime(2));
        assertFalse(PrimeNumber.isPrime(1));
        assertTrue(PrimeNumber.isPrime(17));
        assertFalse(PrimeNumber.isPrime(4));
        assertFalse(PrimeNumber.isPrime(0));
    }
}
