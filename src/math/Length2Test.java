package math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Length2Test {
    @Test
    void footToInches() {
        assertTrue(new Length2(1, "FOOT").isEqual(new Length2(12, "INCHES")));
        assertFalse(new Length2(2, "FOOT").isEqual(new Length2(12, "INCHES")));
    }

    @Test
    void inchesToCentimeters() {
        assertFalse(new Length2(1, "INCHES").isEqual(new Length2(4, "CENTIMETERS")));
        assertTrue(new Length2(2, "INCHES").isEqual(new Length2(5, "CENTIMETERS")));
    }

    @Test
    void centimetersToMillimeters() {
        assertTrue(new Length2(1, "CENTIMETERS").isEqual(new Length2(10, "MILLIMETERS")));
        assertFalse(new Length2(2, "CENTIMETERS").isEqual(new Length2(10, "MILLIMETERS")));
    }

    @Test
    void add() {
        assertEquals(3, new Length2(1, "INCHES").add(new Length2(5, "CENTIMETERS")));
        assertEquals(3, new Length2(2, "INCHES").add(new Length2(2.5, "CENTIMETERS")));
        assertEquals(4, new Length2(2, "INCHES").add(new Length2(2, "INCHES")));
    }
}