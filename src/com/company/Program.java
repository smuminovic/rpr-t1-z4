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
    public static void DodajPredmet() {
        System.out.println("Unesite ime predmeta i sifru: ");
        String imePredmeta = ulaz.nextLine();
        int sifraPredmeta = ulaz.nextInt();
        ulaz.nextLine();
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
        ulaz.nextLine();
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

        public static void KreirajPredmet (String Ime, int sifra){
            Predmet NoviPredmet= new Predmet(Ime,sifra,10);
        }
        public  static Student KreirajStudenta(String ImeStudenta, String PrezimeStudenta, int IndeksStudenta){
            Student NoviStudent=new Student(ImeStudenta,PrezimeStudenta,IndeksStudenta);
            return NoviStudent;
        }
        public static void UpisStudenta(String ImeStudenta,String PrezimeStudenta,int IndeksStudenta,String Naziv){
            Student student=KreirajStudenta(ImeStudenta,PrezimeStudenta,IndeksStudenta);
            Predmet UpisiStudenta=new Predmet(Naziv, student);
        }
        public static void ListaStudenata (){
            for(int i = 0; i< getStudenti().length; i++ ){
                System.out.println((i+1)+". "+ getStudenti()[i].getPrezime()+" "+ getStudenti()[i].getIme()+" ("+ getStudenti()[i].getIndeks()+")");
            }
        }
        public static void ListaPredmeta(){
            //setPredmeti(new Predmet[0]);
            for (int i = 0; i< getPredmeti().length; i++){
                System.out.println((i+1)+". "+ getPredmeti()[i].getNazivPredmeta()+" "+ getPredmeti()[i].getSifraPredmeta());
            }
        }

    public  static void removeElementStudent() {
        System.out.println("Unesite ime, prezime i indeks studenta kojeg zelite izbrisati: ");
        String ime=ulaz.nextLine();
        String prezime=ulaz.nextLine();
        int indeks=ulaz.nextInt();
        ulaz.nextLine();
        Student element=new Student(ime, prezime, indeks);
        int rednibroj = -1;
        for (int i = 0; i < getStudenti().length; i++) {
            if (getStudenti()[i].getIme() == element.getIme() && getStudenti()[i].getPrezime()==element.getPrezime()&& getStudenti()[i].getIndeks()==element.getIndeks()) rednibroj = i;
        }
        if (rednibroj != -1) {
            Student[] n = new Student[getStudenti().length - 1];
            System.arraycopy(getStudenti(), 0, n, 0, rednibroj);
            System.arraycopy(getStudenti(), (rednibroj + 1), n, rednibroj, getStudenti().length - rednibroj - 1);
            setStudenti(n);
        } else System.out.println("Ovaj element se ne nalazi u nizu studenata!");
    }
    public  static void removeElementPredmet( ){
        System.out.println("Unesite ime predmeta i sifru kojeg zelite izbrisati: ");
        String ime=ulaz.nextLine();
        int sifra=ulaz.nextInt();
        ulaz.nextLine();
        Predmet element=new Predmet(ime, sifra, 10);
        int rednibroj = -1;
        for (int i = 0; i < getPredmeti().length; i++) {
            if (getPredmeti()[i].getNazivPredmeta() == element.getNazivPredmeta() && getPredmeti()[i].getSifraPredmeta()==element.getSifraPredmeta()) rednibroj = i;
        }
        if(rednibroj==0) setPredmeti(null);
        else if (rednibroj != -1) {
            Predmet[] n = new Predmet[getPredmeti().length - 1];
            System.arraycopy(getPredmeti(), 0, n, 0, rednibroj);
            System.arraycopy(getPredmeti(), (rednibroj + 1), n, rednibroj, getPredmeti().length - rednibroj - 1);
            setPredmeti(n);
        } else System.out.println("Ovaj element se ne nalazi u nizu predmeta!");
    }
    public  static void UnosStudenata(PrintStream izlaz, Scanner ulaz){
        izlaz.println("Unesite zeljeni broj studenata: ");
        int n=ulaz.nextInt();
        ulaz.nextLine();
        setStudenti(new Student[n]);
        for(int i=0;i<n;i++){
            izlaz.println("Unesite ime, prezime i indeks studenta: ");
            String im=ulaz.nextLine();
            String prez=ulaz.nextLine();
            int in = ulaz.nextInt();
            ulaz.nextLine();
            getStudenti()[i]=new Student(im,prez,in);
        }
    }
    public static void UnosPredmeta() {
        System.out.println("Unesite zeljeni broj predmeta: ");
        int n = ulaz.nextInt();
        ulaz.nextLine();
        setPredmeti(new Predmet[n]);
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite ime predmeta i sifru: ");
            String imePredmeta = ulaz.nextLine();
            int sifra = ulaz.nextInt();
            ulaz.nextLine();
            getPredmeti()[i] = new Predmet(imePredmeta, sifra,10);
        }
    }
    public static void UpisiStudenta() {
        System.out.println("Unesite sifru predmeta: ");
        int sifra = ulaz.nextInt();
        System.out.println("Unesite indeks studenta");
        int indeks = ulaz.nextInt();
        ulaz.nextLine();
        System.out.println("Unesite ime i prezime: ");
        String ime = ulaz.nextLine();
        String prezime = ulaz.nextLine();
        Student novi = new Student(ime, prezime, indeks);
        for (int i = 0; i < getPredmeti().length; i++) {
            if (sifra == getPredmeti()[i].getSifraPredmeta()) {
                getPredmeti()[i].upisi(novi);
                break;
            }
        }
    }
    public static void IspisiStudenta() {
        System.out.println("Unesite sifru predmeta: ");
        int sifra = ulaz.nextInt();
        System.out.println("Unesite indeks studenta");
        int indeks = ulaz.nextInt();
        ulaz.nextLine();
        System.out.println("Unesite ime i prezime: ");
        String ime = ulaz.nextLine();
        String prezime = ulaz.nextLine();
        Student novi = new Student(ime, prezime, indeks);
        for (int i = 0; i < getPredmeti().length; i++) {
            if (sifra == getPredmeti()[i].getSifraPredmeta()) {
                getPredmeti()[i].ispisi(novi);
                break;
            }
        }
    }

    //getteri
    public static Student[] getStudenti() {
        return studenti;
    }
    public  static Predmet[] getPredmeti() {
        return predmeti;
    }

    //setteri
    public static void setStudenti(Student[] studenti) {
        Program.studenti = studenti;
    }
    public static void setPredmeti(Predmet[] predmeti) {
        Program.predmeti = predmeti;
    }



    public static void main(String[] args) {
        UnosStudenata(izlaz, ulaz);
        UnosPredmeta();
        boolean x=true;
        while(x==true){
            System.out.println("Odaberite jednu od iducih opcija:");
            System.out.println("0: Izlaz iz programa ");
            System.out.println("1: Dodavanje studenta, 2: Brisanje studenta, 3: Lista studenata");
            System.out.println("4: Dodavanje predmeta, 5: Brisanje predmeta, 6: Lista predmeta");
            System.out.println("7: Upis studenta, 8: Ispis studenta");
            int opcija=ulaz.nextInt();
            ulaz.nextLine();
            switch (opcija){
                case 0:
                    x=false;
                    break;
                case 1:
                    DodajStudenta();
                    break;
                case 2:
                    removeElementStudent();
                    break;
                case 3:
                    ListaStudenata();
                    break;
                case 4:
                    DodajPredmet();
                    break;
                case 5:
                    removeElementPredmet();
                    break;
                case 6:
                    ListaPredmeta();
                    break;
                case 7:
                    IspisiStudenta();
                    break;
                case 8:
                    UpisiStudenta();
            }
        }
    }
}
