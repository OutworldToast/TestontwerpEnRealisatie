import org.example.Vliegveld;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PairwiseTest {

    @Test
    public void bepaalTotaalPrijs1100Test() {
        Vliegveld vliegveld = new Vliegveld();

        int weightE1 = 999;
        int passagersE1 = 2;
        boolean notNeedsHandling = false;
        boolean isNotDutch = false;

        double expected = 100;
        double actual = vliegveld.bepaalTotaalPrijsVliegtuig(weightE1, passagersE1, notNeedsHandling, isNotDutch);

        assertEquals(expected, actual);
    }

    @Test
    public void bepaalTotaalPrijs1211Test() {
        Vliegveld vliegveld = new Vliegveld();

        int weightE1 = 999;
        int passagersE2 = 3;
        boolean needsHandling = true;
        boolean isDutch = true;

        double expected = 1149.5;
        double actual = vliegveld.bepaalTotaalPrijsVliegtuig(weightE1, passagersE2, needsHandling, isDutch);

        assertEquals(expected, actual);
    }

    @Test
    public void bepaalTotaalPrijs2110Test() {
        Vliegveld vliegveld = new Vliegveld();

        int weightE2 = 1000;
        int passagersE1 = 2;
        boolean needsHandling = true;
        boolean isNotDutch = false;

        double expected = 1300;
        double actual = vliegveld.bepaalTotaalPrijsVliegtuig(weightE2, passagersE1, needsHandling, isNotDutch);

        assertEquals(expected, actual);
    }

    @Test
    public void bepaalTotaalPrijs2201Test() {
        Vliegveld vliegveld = new Vliegveld();

        int weightE2 = 1000;
        int passagersE2 = 3;
        boolean notNeedsHandling = false;
        boolean isDutch = true;

        double expected = 907.5;
        double actual = vliegveld.bepaalTotaalPrijsVliegtuig(weightE2, passagersE2, notNeedsHandling, isDutch);

        assertEquals(expected, actual);
    }

    @Test
    public void bepaalTotaalPrijs3101Test() {
        Vliegveld vliegveld = new Vliegveld();

        int weightE3 = 5000;
        int passagersE1 = 2;
        boolean notNeedsHandling = false;
        boolean IsDutch = true;

        double expected = 3025;
        double actual = vliegveld.bepaalTotaalPrijsVliegtuig(weightE3, passagersE1, notNeedsHandling, IsDutch);

        assertEquals(expected, actual);
    }

    @Test
    public void bepaalTotaalPrijs3210Test() {
        Vliegveld vliegveld = new Vliegveld();

        int weightE3 = 5000;
        int passagersE2 = 3;
        boolean needsHandling = true;
        boolean isNotDutch = false;

        double expected = 4550;
        double actual = vliegveld.bepaalTotaalPrijsVliegtuig(weightE3, passagersE2, needsHandling, isNotDutch);

        assertEquals(expected, actual);
    }
}
