package fidanhykolli.test1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest {

    @Test
    public void testAddition() {

        assertEquals(5, 2 + 3);
    }

    @Test
    public void testSubtraction() {

        assertEquals(3, 5 - 2);
    }

    @Test
    public void testMultiplication() {

        assertEquals(10, 2 * 5);
    }

    @Test
    public void testDivision() {

        assertEquals(2, 10 / 5);
    }

}