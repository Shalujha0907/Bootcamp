package math;

public class Length {
    private final double meters;

    private Length(double meters) {
        this.meters = meters;
    }

    static Length foot(double foot) {
        return new Length(foot * 0.3048);
    }

    static Length inches(double inches) {
        return new Length(inches * 0.0254);
    }

    static Length centimeters(double centimeters) {
        return new Length(centimeters / 100);
    }

    static  Length millimeters(double millimeters) {
        return new Length(millimeters / 1000);
    }

   public boolean compare(Length length) {
        return Math.round(this.meters) == Math.round(length.meters);
   }

}
