package math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {

    @Test
    void convert() {
        assert(Length.foot(1).compare(Length.inches(12)));
        assert(Length.foot(2).compare(Length.inches(24)));
        assert(Length.inches(2).compare(Length.centimeters(5)));
        assert(Length.inches(1).compare(Length.centimeters(2.5)));
        assert(Length.centimeters(1).compare(Length.millimeters(10)));
        assert(Length.centimeters(2).compare(Length.millimeters(20)));
    }
}