import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @Test
    void format() {
        String result = NameFormatter.format("sr", "john", "pork", "senoti", "jr");
        assertEquals("", result);
    }
}