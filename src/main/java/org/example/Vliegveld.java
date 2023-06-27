package org.example;

public class Vliegveld {

    public boolean magOpstijgen(boolean toestemming, int gewicht, int tegenwind) {
        return toestemming && (isLicht(gewicht) || isHoog(tegenwind));
    }

    public boolean isLicht(int gewicht) {
        return gewicht <= 1000;
    }

    public boolean isHoog(int tegenwind) {
        return tegenwind > 50;
    }



    public double bepaalTotaalPrijsVliegtuig (int gewicht, int aantalPassagiers, boolean afhandelingNodig, boolean nederlands) {
        return addBTW(nederlands, addAfhandelingsBonus(afhandelingNodig, addPassagiersBonus(aantalPassagiers, bepaalBasisPrijsVliegtuig(gewicht))));
    }

    public int bepaalBasisPrijsVliegtuig (int gewicht) {
        if (gewicht < 1000) {return 100;}
        else {return gewicht < 5000 ? 500 : 2500;}
    }

    public double addPassagiersBonus(int aantalPassagiers, double prijs) {
        return aantalPassagiers < 3 ? prijs : prijs * 1.5;
    }

    public double addAfhandelingsBonus(boolean afhandelingNodig, double prijs) {
        return afhandelingNodig ? prijs + 800 : prijs;
    }

    public double addBTW(boolean nederlands, double prijs) {
        return nederlands ? prijs * 1.21 : prijs;
    }

}
