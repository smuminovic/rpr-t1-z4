package com.company;

public class Student {
    //atrubuti
    private String imeStudenta;
    private String prezimeStudenta;
    private int brojIndeksa;

    //konstruktor
    public Student(String ime, String prezime, int indeks) {
        this.imeStudenta = ime;
        this.prezimeStudenta = prezime;
        this.brojIndeksa = indeks;
    }
    //getteri
    public String getIme() {
        return imeStudenta;
    }
    public String getPrezime() {
        return prezimeStudenta;
    }
    public int getIndeks() {
        return brojIndeksa;
    }

    //setteri
    public void setIme(String ime) {
        this.imeStudenta = ime;
    }
    public void setPrezime(String prezime) {
        this.prezimeStudenta = prezime;
    }
    public void setIndeks(int index) {
        this.brojIndeksa = index;
    }
}

