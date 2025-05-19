package math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void probability() throws Exception {
      assertThrows(Exception.class, () -> Probability.initialise(-2));
      assertEquals(Probability.initialise(0.75), Probability.complement(0.25));
      assertEquals(Probability.initialise(0.5), Probability.complement(0.5));
    }

    @Test
    void and() {
        Probability p1 = new Probability(0.5);
        Probability p2 = new Probability(0.5);

        assertEquals(new Probability(0.25), p1.and(p2));
    }

    @Test
    void or() {
        Probability p1 = new Probability(0.5);
        Probability p2 = new Probability(0.5);

        assertEquals(new Probability(0.75), p1.or(p2));
    }
}