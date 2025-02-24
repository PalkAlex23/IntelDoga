package hu.szamalk.modell;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarazsTest {

    @Test
    void teliGarazs() {
        Jarmu j1 = new Jarmu("piros", new Tulajdonos("Arany János"));
        Jarmu j2 = new Jarmu("kék", new Tulajdonos("Arany János"));
        Jarmu j3 = new Jarmu("sárga", new Tulajdonos("Arany János"));
        Jarmu j4 = new Jarmu("narancs", new Tulajdonos("Arany János"));
        Jarmu j5 = new Jarmu("bordó", new Tulajdonos("Arany János"));

        Garazs garazs = new Garazs();
        garazs.beallas(j1);
        garazs.beallas(j2);
        garazs.beallas(j3);
        garazs.beallas(j4);
        garazs.beallas(j5);

        Jarmu j6 = new Jarmu("fehér", new Tulajdonos("Palkovics János"));
        assertEquals("A garázs megtelt!", garazs.beallas(j6));
    }
}
