package com.company;

import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {

    @Test
    void dodajPredmet() {
        Predmet p = new Predmet("Razvoj programskih rjesenja", 100, 25);
    }

    @Test
    void dodajStudenta() {
        Student s = new Student("Aaaa", "Bbbb", 17582);
    }

    @Test
    void kreirajPredmet() {
    }

    @Test
    void kreirajStudenta() {
    }

    @Test
    void upisStudenta() {
    }

    @Test
    void listaStudenata() {
    }

    @Test
    void listaPredmeta() {
    }

    @Test
    void removeElementStudent() {
    }

    @Test
    void removeElementPredmet() {
    }

    @Test
    void unosStudenata() {
        Scanner ulaz = new Scanner(System.in);
        PrintStream izlaz = System.out;

    }

    @Test
    void unosPredmeta() {
    }

    @Test
    void upisiStudenta() {
    }

    @Test
    void ispisiStudenta() {
    }

    @Test
    void getStudenti() {
        Predmet p = new Predmet("rpr", 101, 8);
        Student s = new Student("Cccc", "Dddd", 17581);
        p.setStudenti(new Student[12]);
        assertEquals(12 , p.getStudenti().length);
        p.setStudenti(null);
        assertEquals(null , p.getStudenti());
    }

    @Test
    void getPredmeti() {
    }

    @Test
    void setStudenti() {
        Predmet p = new Predmet("rpr", 101, 8);
        Student[] s=new Student[2];
        p.setStudenti(new Student[2]);
        assertEquals(2, (p.getStudenti().length));
    }

    @Test
    void setPredmeti() {
    }

    @Test
    void main() {
    }
}