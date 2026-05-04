import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenNumberTest {
    @Test
    public void testIsEven() {
        assertTrue(EvenNumber.isEven(4));
        assertFalse(EvenNumber.isEven(7));
        assertTrue(EvenNumber.isEven(0));
        assertTrue(EvenNumber.isEven(-2));
    }
}
