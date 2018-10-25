package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getIme() {
        Student s=new Student("Aaaa", "Bbbb", 17582);
        Student s1=new Student(null, null, 000);
        assertAll("Provjera imena", ()-> assertEquals("Aaaa", s.getIme()),
                ()-> assertEquals(null,s1.getIme()));
    }

    @Test
    void getPrezime() {
    }

    @Test
    void getIndeks() {
        Student s=new Student("Aaaa", "Bbbb", 17582);
        Student s2=new Student("aaaa","bbbb", Integer.MIN_VALUE);
        Student s1=new Student(null, null, 0000);
        assertAll("Provjera indeksa", ()-> assertEquals(0, s1.getIndeks()),
                ()-> assertEquals(17582,s.getIndeks()),
                ()-> assertEquals(Integer.MIN_VALUE, s2.getIndeks()));
    }

    @Test
    void setIme() {
        Student s=new Student("Aaaa", "Bbbb", 17582);
        s.setIme("Lejla");
        assertEquals("Aaaa", s.getIme());
        s.setIme(null);
        assertEquals(null, s.getIme());
    }

    @Test
    void setPrezime() {
    }

    @Test
    void setIndeks() {
    }
}