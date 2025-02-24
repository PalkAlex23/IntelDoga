package hu.szamalk.modell;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Garazs implements Iterable, Serializable {
    private ArrayList<Jarmu> jarmuk;

    public Garazs() {
        this.jarmuk = new ArrayList<>();
    }

    public ArrayList<Jarmu> getJarmuk() {
        return (ArrayList<Jarmu>) Collections.unmodifiableList(jarmuk);
    }

    public void setJarmuk(ArrayList<Jarmu> jarmuk) {
        this.jarmuk = jarmuk;
    }

    public String beallas(Jarmu jarmu) {
        if (jarmuk.size() < 5) {
            jarmuk.add(jarmu);
            return "A jármű beállt a garázsba.";
        }
        return "A garázs megtelt!";
    }

    public void kiallas(Jarmu jarmu) {
        jarmuk.remove(jarmu);
        System.out.println("A jármű kiállt a garázsból.");
    }

    public void megjelen() {
        System.out.println("Garázsban álló járművek: ");
        for(Jarmu jarmu : jarmuk) {
            System.out.println(jarmu);
        }
    }

    public void kiir() {
        Object objKiir = jarmuk;
        try (ObjectOutputStream objKi = new ObjectOutputStream(new FileOutputStream("teszt.txt"))) {
            objKi.writeObject(objKiir);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void beolvas() {
        try (ObjectInputStream objBe = new ObjectInputStream(new FileInputStream("teszt.txt"))) {
            Jarmu jarmu = (Jarmu) objBe.readObject();
            System.out.println("Járműk: " + jarmu);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Garazs{" +
                "jarmuk=" + jarmuk +
                '}';
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
