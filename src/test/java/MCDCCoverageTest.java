import org.example.Vliegveld;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MCDCCoverageTest {

    @Test
    public void magOpstijgen110Test() {
        Vliegveld vliegveld = new Vliegveld();

        boolean permitted = true;
        int withinBoundsWeight = 1000;
        int outOfBoundsSpeed = 50;

        assertTrue(vliegveld.magOpstijgen(permitted, withinBoundsWeight, outOfBoundsSpeed));
    }

    @Test
    public void magOpstijgen100Test() {
        Vliegveld vliegveld = new Vliegveld();

        boolean permitted = true;
        int outOfBoundsWeight = 1001;
        int outOfBoundsSpeed = 50;

        assertFalse(vliegveld.magOpstijgen(permitted, outOfBoundsWeight, outOfBoundsSpeed));
    }

    @Test
    public void magOpstijgen101Test() {
        Vliegveld vliegveld = new Vliegveld();

        boolean permitted = true;
        int outOfBoundsWeight = 1001;
        int withinBoundsSpeed = 51;

        assertTrue(vliegveld.magOpstijgen(permitted, outOfBoundsWeight, withinBoundsSpeed));
    }

    @Test
    public void magOpstijgen001Test() {
        Vliegveld vliegveld = new Vliegveld();

        boolean notPermitted = false;
        int outOfBoundsWeight = 1001;
        int withinBoundsSpeed = 51;

        assertFalse(vliegveld.magOpstijgen(notPermitted, outOfBoundsWeight, withinBoundsSpeed));
    }


}
