package math;

public enum Units {
    FOOT("FOOT", 3.28084),
    INCHES("INCHES", 39.3701),
    CENTIMETERS("CENTIMETERS", 100),
    MILLIMETERS("MILLIMETERS", 1000);

    private final String unit;
    private final double base;

    Units(String unit, double base) {
        this.unit = unit;
        this.base = base;
    }

    public String getUnit(){
        return this.unit;
    }
    public double getBase(){
        return this.base;
    }
}
