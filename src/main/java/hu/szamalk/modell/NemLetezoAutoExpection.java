package hu.szamalk.modell;

public class NemLetezoAutoExpection extends Throwable {
    public NemLetezoAutoExpection() {
        super("A rendszám nem rendelkezik 6 betűvel");
    }
}
