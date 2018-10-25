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

    public static void DodajPredmet(Predmet p){
        boolean ima = false;
        for (int i = 0; i < predmeti.length; i++) if (predmeti[i].getSifraPredmeta() == p.getSifraPredmeta()) ima = true;
        if(!ima) {
            Predmet[] NoviNiz = new Predmet[predmeti.length + 1];
            for (int i = 0; i < predmeti.length; i++) {
                NoviNiz[i] = predmeti[i];
            }
            NoviNiz[predmeti.length] = p;
            predmeti = NoviNiz;
            System.out.println("OK");
        }else System.out.println("Student vec postoji!");

    }

    //dodavanje studenta

    public  static void DodajStudenta(Student s) {

        boolean ima = false;
        for (int i = 0; i < studenti.length; i++) if (studenti[i].getIndeks() == s.getIndeks()) ima = true;
        if (!ima) {
            Student[] NoviNiz = new Student[studenti.length + 1];
            for (int i = 0; i < studenti.length; i++) {
                NoviNiz[i] = studenti[i];
            }
            NoviNiz[studenti.length] = s;
            studenti = NoviNiz;
            System.out.println("OK");
        } else System.out.println("Student vec postoji");
    }
    public  static void DodajStudenta() {
        System.out.println("Unesite ime, prezime i indeks studenta: ");
        String ime = ulaz.nextLine();
        String prezime = ulaz.nextLine();
        int indeks = ulaz.nextInt();
        boolean ima = false;
        for (int i = 0; i < studenti.length; i++) if (studenti[i].getIndeks() == indeks) ima = true;
        if (!ima) {
            Student Novi = new Student(ime, prezime, indeks);
            Student[] NoviNiz = new Student[studenti.length + 1];
            for (int i = 0; i < studenti.length; i++) {
                NoviNiz[i] = studenti[i];
            }
            NoviNiz[studenti.length] = Novi;
            studenti = NoviNiz;
            System.out.println("OK");
        } else System.out.println("Student vec postoji");
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
