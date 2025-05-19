import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyTest {
    @Test
    void printHello() {
        Dummy dummy = new Dummy();
        assertEquals("Hello and welcome!", dummy.printHello());
    }

    @Test
    void printBye() {
        Dummy dummy = new Dummy();
        assertEquals("Bye and goodbye!", dummy.printBye());
    }

}