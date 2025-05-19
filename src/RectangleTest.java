import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void area() {
        assertEquals(0, new Rectangle(0, 0).area());
        assertEquals(1, new Rectangle(1, 1).area());
        assertEquals(6, new Rectangle(2, 3).area());
    }

    @Test
    void perimeter() {
        assertEquals(0, new Rectangle(0, 0).perimeter());
        assertEquals(4, new Rectangle(1, 1).perimeter());
        assertEquals(10, new Rectangle(2, 3).perimeter());
    }
}