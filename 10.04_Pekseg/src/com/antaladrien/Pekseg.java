package com.antaladrien;

import java.io.*;
import java.util.ArrayList;

public class Pekseg {
    public static ArrayList<Arlap> lista = new ArrayList<Arlap>();

    public static void main(String[] args) {
        try {
            vasarlok();
            etelLeltar();
        } catch (Exception ex){
            System.out.println("Hiba történt.");
        }
    }

    public static void vasarlok() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("pekaru.txt"));
        String line = br.readLine();
        while (line != null) {
            String[] szavak = line.split(" ");
            if (szavak[0].equals("Pogacsa")) {
                Pogacsa p = new Pogacsa(Integer.parseInt(szavak[1]), Integer.parseInt(szavak[2]));
                lista.add(p);
            } else if (szavak[0].equals("Kave")) {
                if (szavak[1].equals("habos")) {
                    Kave k = new Kave(true);
                    lista.add(k);
                } else if (szavak[1].equals("nem_habos")) {
                    Kave k = new Kave(false);
                    lista.add(k);
                } else {
                    System.out.println("Rossz sor");
                }
            } else {
                System.out.println("Rossz sor");
            }
            line = br.readLine();
        }
        br.close();
    }

    public static void etelLeltar() throws IOException {
        BufferedWriter wr = new BufferedWriter(new FileWriter("leltar.txt"));
        for (Object o : lista) {
            if (o instanceof Pogacsa) {
                wr.write(((Pogacsa)o).toString() + "\n");
            }
        }
        wr.close();
    }
}
