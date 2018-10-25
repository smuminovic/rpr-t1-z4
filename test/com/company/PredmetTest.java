package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void dodajNovogStudenta() {
    }

    @Test
    void upisi() {
        Predmet p = new Predmet("RPR", 111,14);
        assertAll("predmet",
                () -> assertEquals("RPR", p.getNazivPredmeta()),
                () -> assertEquals(111, p.getSifraPredmeta()));
    }

    @Test
    void getNazivPredmeta() {
        Predmet p = new Predmet("RPR", 003, 12);
        assertAll("predmet", () -> assertEquals("RPR", p.getNazivPredmeta()));
    }

    @Test
    void getSifraPredmeta() {
        Predmet p = new Predmet("RPR", 003, 12);
        assertAll("sifra", () -> assertEquals(003,p.getSifraPredmeta()));
    }

    @Test
    void getMaxBrojStudenata() {
    }

    @Test
    void getStudenti() {
        Predmet p = new Predmet("rpr", 001, 7);
        Student s = new Student("Aaaa", "Bbbb", 17582);
        p.setStudenti(new Student[12]);
        assertThrows(IllegalArgumentException.class, () -> {
            p.upisi(s);
        });
        p.setStudenti(null);
        assertArrayEquals(null , p.getStudenti());
    }

    @Test
    void setSifraPredmeta() {
        Predmet p = new Predmet("RPR", 17582, 12);
        p.setSifraPredmeta(17582);
        assertEquals("RPR 17582", p.toString());
    }

    @Test
    void setNazivPredmeta() {
            Predmet p = new Predmet("RPR", 17582, 12);
            p.setNazivPredmeta("OR");
            assertEquals("OR 17582", p.toString());
    }

    @Test
    void setStudenti() {
        Predmet p = new Predmet("rpr", 001, 7);
        Student[] s=new Student[2];
        p.setStudenti(new Student[2]);
        assertEquals(2, (p.getStudenti().length));
    }

    @Test
    void ispisi() {
    }
}