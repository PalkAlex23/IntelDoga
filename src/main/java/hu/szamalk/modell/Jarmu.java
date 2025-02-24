package hu.szamalk.modell;

import java.util.UUID;

public class Jarmu implements Cloneable {
    private UUID id;
    private String szin;
    private Tulajdonos tulajdonos;

    public Jarmu(String szin, Tulajdonos tulajdonos) {
        this.id = UUID.randomUUID();
        this.szin = szin;
        this.tulajdonos = tulajdonos;
    }

    public UUID getId() {
        return id;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public Tulajdonos getTulajdonos() {
        return tulajdonos;
    }

    public void setTulajdonos(Tulajdonos tulajdonos) {
        this.tulajdonos = tulajdonos;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object ujJarmu = new Jarmu(this.szin, this.tulajdonos);
        return ujJarmu;
    }

    @Override
    public String toString() {
        return "Jarmu{" +
                "id=" + id +
                ", szin='" + szin + '\'' +
                ", tulajdonos=" + tulajdonos +
                '}';
    }
}
