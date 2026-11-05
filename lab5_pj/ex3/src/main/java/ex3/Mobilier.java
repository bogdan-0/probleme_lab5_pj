package main.java.ex3;

import java.util.List;


public class Mobilier {
    private String nume;
    private List<Placa> placi;


    public Mobilier() {
    }


    public Mobilier(String nume, List<Placa> placi) {
        super();
        this.nume = nume;
        this.placi = placi;
    }


    public String getNume() {
        return nume;
    }


    public void setNume(String nume) {
        this.nume = nume;
    }


    public List<Placa> getPlaci() {
        return placi;
    }

    public void setPlaci(List<Placa> placi) {
        this.placi = placi;
    }


    public int numarColiPalNecesare() {
        int arieCoala = 2800 * 2070;
        int arieTotalaMobilier = 0;
        for (Placa p : placi) {
            arieTotalaMobilier += p.arieTotalaPlaca();
        }
        return (int) Math.ceil((double) arieTotalaMobilier / arieCoala);
    }

    @Override
    public String toString() {
        return "Mobilier [nume=" + nume + ", placi=" + placi + "]";
    }
}