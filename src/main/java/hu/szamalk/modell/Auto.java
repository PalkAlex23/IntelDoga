package hu.szamalk.modell;

public class Auto {
    private String rendszam;
    private int ferohely, ar;

    public Auto(String rendszam, int ferohely, int ar) throws NemLetezoAutoExpection {
        if (rendszam.length() < 6) {
            throw new NemLetezoAutoExpection();
        }
        this.rendszam = rendszam;
        this.ferohely = ferohely;
        this.ar = ar;
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public int getFerohely() {
        return ferohely;
    }

    public void setFerohely(int ferohely) {
        this.ferohely = ferohely;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "rendszam='" + rendszam + '\'' +
                ", ferohely=" + ferohely +
                ", ar=" + ar +
                '}';
    }
}
