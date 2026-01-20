import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calc = new Calculator();
        assertEquals(5, 2+3);
    }

    @Test
    void testSubtraction() {
        Calculator calc = new Calculator();
        assertEquals(1, 3-2);
    }
}
