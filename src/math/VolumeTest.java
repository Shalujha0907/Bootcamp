package math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {

    @Test
    void volume() {
        assert(Volume.gallon(1).isEqual(Volume.litres(3.78)));
    }

}