package com.company;

import java.util.Scanner;
import java.io.PrintStream;

public class Program {
    //atributi
    public static Scanner ulaz = new Scanner(System.in);
    public static PrintStream izlaz = System.out;
    private static Student[] studenti;
    private static Predmet[] predmeti;

    //dodavnje predmeta
    public void DodajPredmet() {
        System.out.println("Unesite ime predmeta i sifru: ");
        String imePredmeta = ulaz.nextLine();
        int sifraPredmeta = ulaz.nextInt();
        Predmet noviPredmet = new Predmet (imePredmeta, sifraPredmeta, 25);
        Predmet[] noviNiz = new Predmet[getPredmeti().length +1];
        for (int i = 0; i < getPredmeti().length; i++) {
            noviNiz[i] = getPredmeti()[i];
        }
        noviNiz[getPredmeti().length] = noviPredmet;
        setPredmeti(noviNiz);
    }

    //getteri
    public static Predmet[] getPredmeti() {
        return predmeti;
    }

    //setteri
    public void setPredmeti(Predmet[] noviPredmeti) {
        this.predmeti = noviPredmeti;
    }

    public static void main(String[] args) {

    }
}
