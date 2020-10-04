package com.antaladrien;

public class Pogacsa extends Peksutemeny{
    public Pogacsa(int mennyiseg, int alapar) {
        super(mennyiseg, alapar);
    }

    public void megkostol() {
        this.mennyiseg = this.mennyiseg/2;
    }

    @Override
    public String toString() {
        return "Pogacsa " + super.toString();
    }
}
