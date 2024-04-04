package fidanhykolli.test1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringTest {

    @Test
    public void testConcatenation() {
        String str1 = "Hello";
        String str2 = "World";
        assertEquals("HelloWorld", str1 + str2);
    }

    @Test
    public void testLength() {
        String str = "Hello";
        assertEquals(5, str.length());
    }

    @Test
    public void testSubstring() {
        String str = "HelloWorld";
        assertEquals("World", str.substring(5));
    }

    @Test
    public void testUpperCase() {
        String str = "hello";
        assertEquals("HELLO", str.toUpperCase());
    }

    @Test
    public void testLowerCase() {
        String str = "WORLD";
        assertEquals("world", str.toLowerCase());
    }
}
