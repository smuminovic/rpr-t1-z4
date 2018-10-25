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

    public Predmet(String naziv, Student podaci){
        this.setNazivPredmeta(naziv);
        DodajNovogStudenta(podaci);
    }

    //dodavanje novog studenta na predmet, poziv je u metodi upisi
    public void DodajNovogStudenta(Student s) {
        Student[] noviStudenti = new Student[getStudenti().length+1];
        if (getStudenti().length < maxBrojStudenata) {
            noviStudenti = new Student[getStudenti().length +1];
            for (int i = 0; i < getStudenti().length; i++) {
                noviStudenti[i] = getStudenti()[i];
            }
            noviStudenti[getStudenti().length] = s;
        }
        setStudenti(noviStudenti);
    }

    //upisivanje studenta na predmet
    public void upisi(Student student) throws IllegalArgumentException {
        if (studenti.length > maxBrojStudenata)
            throw new IllegalArgumentException ("Predmet popunjen.");
        else
            DodajNovogStudenta(student);
    }

    //getteri
    public String getNazivPredmeta() {
        return nazivPredmeta;
    }
    public int getSifraPredmeta() {
        return sifraPredmeta;
    }
    public int getMaxBrojStudenata() {
        return maxBrojStudenata;
    }
    public Student[] getStudenti() {
        return  studenti;
    }

    //setteri
    public void setSifraPredmeta(int novaSifra) {
        sifraPredmeta = novaSifra;
    }
    public void setNazivPredmeta(String noviNaziv) {
        nazivPredmeta = noviNaziv;
    }
    public void setStudenti(Student[] studenti) {
        this.studenti = studenti;
    }

    //ispisvanje studenta sa predmeta
    public void ispisi(Student student) {
        for (int i = 0; i < getStudenti().length; i++) {
            if (getStudenti()[i].getIme() == student.getIme()) getStudenti()[i] = null;
        }
    }

    @Override
    public String toString() {
        return getNazivPredmeta()+" "+sifraPredmeta;
    }

}