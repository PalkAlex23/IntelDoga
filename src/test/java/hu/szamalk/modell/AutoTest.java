package hu.szamalk.modell;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoTest {

    @Test
    void rendszamKivetel() throws NemLetezoAutoExpection {
        /* egy teszt fájl */
        Auto auto = new Auto("ACB01", 5, 3000000);
        /* assertThrows(auto, new NemLetezoAutoExpection());*/
    }
}