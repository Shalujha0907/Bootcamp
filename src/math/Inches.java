package math;

public class Inches  extends Convert{
    private final double value;
    double base = 39.3701;

    Inches(double value) {
        this.value = value;
    }

    public Double compare( Foot otherValue) {
        return otherValue.convertTo(base);
    }

}
