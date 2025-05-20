package math;

import java.util.Objects;

public  class Probability {
    private final double chance;

    public Probability(double chance) {
        this.chance = chance;
    }

    public static Probability initialise(double chance) throws InvalidError {
        if (chance < 0 || chance > 1) {
            throw new InvalidError();
        }

        return new Probability(chance);
    }

    public static Probability complement(double chance) throws InvalidError {
    return  Probability.initialise(1 - chance);
    }

    public Probability and(Probability p2) {
        return new Probability(chance * p2.chance);
    }

    public Probability or(Probability p2) {
        return new Probability(chance + p2.chance - (chance * p2.chance));
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Probability)) return false;
        Probability that = (Probability) o;
        return Double.compare(chance, that.chance) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(chance);
    }
}
