package math;

import java.util.Objects;

public class Length2 {
    private final double value;
    Units type;

    public Length2(double value, String type) {
        this.value = value;
        this.type = Units.valueOf(type);
    }

    Double convertTO(double otherBase) {
        return (this.value / this.type.getBase()) * otherBase;
    }

    public Boolean isEqual(Length2 otherValue) {
        return Math.round(this.value) == Math.round(otherValue.convertTO(type.getBase()));
    }

    public double add(Length2 otherValue) {
        double inchBase = Units.INCHES.getBase();
        return Math.round(this.convertTO(inchBase) + otherValue.convertTO(inchBase));
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Length2)) return false;
        Length2 length2 = (Length2) o;
        return Double.compare(value, length2.value) == 0 && type == length2.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, type);
    }
}

