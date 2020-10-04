package com.antaladrien;

public class Kave implements Arlap {
    private boolean habosE;

    public Kave(boolean habosE) {
        this.habosE = habosE;
    }

    public double mennyibeKerul() {
        if (habosE) {
            return CSESZEKAVE * 1.5;
        } else {
            return CSESZEKAVE;
        }
    }

    @Override
    public String toString() {
        return habosE?"Habos kávé ":"Nem habos kávé " + mennyibeKerul() + " Ft";
    }
}
