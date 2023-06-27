import org.example.Vliegveld;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EquivalentieklassenTest {

    @Test
    public void bepaalBasisPrijs0Test () {
        Vliegveld vliegveld = new Vliegveld();

        int expected = 100;
        int actual = vliegveld.bepaalBasisPrijsVliegtuig(0);

        assertEquals(expected, actual);

    }

    @Test
    public void bepaalBasisPrijs998Test () {
        Vliegveld vliegveld = new Vliegveld();

        int expected = 100;
        int actual = vliegveld.bepaalBasisPrijsVliegtuig(998);

        assertEquals(expected, actual);

    }

    @Test
    public void bepaalBasisPrijs999Test () {
        Vliegveld vliegveld = new Vliegveld();

        int expected = 100;
        int actual = vliegveld.bepaalBasisPrijsVliegtuig(999);

        assertEquals(expected, actual);

    }

    @Test
    public void bepaalBasisPrijs1000Test () {
        Vliegveld vliegveld = new Vliegveld();

        int expected = 500;
        int actual = vliegveld.bepaalBasisPrijsVliegtuig(1000);

        assertEquals(expected, actual);

    }

    @Test
    public void bepaalBasisPrijs1001Test () {
        Vliegveld vliegveld = new Vliegveld();

        int expected = 500;
        int actual = vliegveld.bepaalBasisPrijsVliegtuig(1000);

        assertEquals(expected, actual);

    }

    @Test
    public void bepaalBasisPrijs4998Test () {
        Vliegveld vliegveld = new Vliegveld();

        int expected = 500;
        int actual = vliegveld.bepaalBasisPrijsVliegtuig(4998);

        assertEquals(expected, actual);

    }

    @Test
    public void bepaalBasisPrijs4999Test () {
        Vliegveld vliegveld = new Vliegveld();

        int expected = 500;
        int actual = vliegveld.bepaalBasisPrijsVliegtuig(4999);

        assertEquals(expected, actual);

    }

    @Test
    public void bepaalBasisPrijs5000Test () {
        Vliegveld vliegveld = new Vliegveld();

        int expected = 2500;
        int actual = vliegveld.bepaalBasisPrijsVliegtuig(5000);

        assertEquals(expected, actual);

    }

    @Test
    public void bepaalBasisPrijs5001Test () {
        Vliegveld vliegveld = new Vliegveld();

        int expected = 2500;
        int actual = vliegveld.bepaalBasisPrijsVliegtuig(5001);

        assertEquals(expected, actual);

    }

}
