package com.antaladrien;

public abstract class Peksutemeny implements Arlap {
    protected double mennyiseg;
    private double alapar;

    public Peksutemeny(double mennyiseg, double alapar) {
        this.mennyiseg = mennyiseg;
        this.alapar = alapar;
    }

    public abstract void megkostol();

    public double mennyibeKerul() {
        return alapar*mennyiseg;
    }

    public double getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(double mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    public double getAlapar() {
        return alapar;
    }

    public void setAlapar(double alapar) {
        this.alapar = alapar;
    }

    @Override
    public String toString() {
        return mennyiseg + " db - " + mennyibeKerul() + " Ft";
    }
}
