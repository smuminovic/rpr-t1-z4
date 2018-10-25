package com.company;


public class Predmet {
    //atributi
    private Student[] studenti;
    private String nazivPredmeta;
    private int sifraPredmeta;
    public int maxBrojStudenata;

    //konstruktor
    public Predmet(String ime, int sifra, int brojStudenata) {
        this.nazivPredmeta = ime;
        this.sifraPredmeta = sifra;
        this.maxBrojStudenata = brojStudenata;
        studenti = new Student[0];
    }

}
