package math;

public class Foot  extends Convert{
    private final double value;
    double base = 3.28084;

    Foot(double value) {
        this.value = value;
    }

    public Boolean compare( double otherValue) {
        return otherValue == this.value;
    }

}
