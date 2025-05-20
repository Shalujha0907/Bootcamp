package math;

import java.util.function.Predicate;

public class Volume {
    private final double litre;

    Volume(double litre) {
        this.litre = litre;
    }

    public static Volume gallon(double gallon) {
        return  new Volume(gallon * 3.78);
    }

    public static Volume litre(double litre) {
        return  new Volume(litre);
    }
}
