import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void area() {
        assertEquals(0,new Square(0).area());
        assertEquals(4,new Square(2).area());
    }

    @Test
    void perimeter() {
        assertEquals(0, new Square(0).perimeter());
        assertEquals(4, new Square(1).perimeter());
        assertEquals(8, new Square(2).perimeter());
    }
}