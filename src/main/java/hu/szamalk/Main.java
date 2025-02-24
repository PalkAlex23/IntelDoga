package hu.szamalk;

import hu.szamalk.modell.Garazs;
import hu.szamalk.modell.Jarmu;
import hu.szamalk.modell.Tulajdonos;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Jarmu j1 = new Jarmu("piros", new Tulajdonos("Szabó János"));
        Jarmu j2 = (Jarmu) j1.clone();

        System.out.println(j1);
        System.out.println(j2);

        j2.setSzin("kék");
        j2.setTulajdonos(new Tulajdonos("Lukács Péter"));

        System.out.println(j1);
        System.out.println(j2);

        /* Ki és beállás a járművekkel */
        Garazs garazs = new Garazs();
        garazs.beallas(j1);
        garazs.beallas(j2);
        garazs.megjelen();
        garazs.kiallas(j1);
        garazs.megjelen();
    }
}