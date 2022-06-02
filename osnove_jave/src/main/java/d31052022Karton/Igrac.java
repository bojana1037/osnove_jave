package d31052022Karton;

import java.util.ArrayList;

//Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//broj (broj koji igrac nosi)
//poziciju koju igra (odbrambeni, napadac, … )
//niz kartona
//kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere za broj, kapiten i poziciju
//metodu dodaj karton, gde se dodaje karton u niz
//metodu koja vraca broj zutih kartona
//metodu koja vraca broj crvenih kartona
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
public class Igrac extends Osoba {
    protected int brojNaDresu;
    protected String pozicijaIgraca;
    private ArrayList<Karton> nizKartona = new ArrayList<Karton>();
    private boolean daLiJeKapiten;

    public Igrac( String punoIme, String jmbg, int godRodjenja, int brojNaDresu, String pozicijaIgraca, boolean daLiJeKapiten) {
        super(punoIme, jmbg, godRodjenja);
        this.brojNaDresu = brojNaDresu;
        this.pozicijaIgraca = pozicijaIgraca;
        this.daLiJeKapiten = daLiJeKapiten;
    }

    public int getBrojNaDresu() {
        return brojNaDresu;
    }

    public void setBrojNaDresu(int brojNaDresu) {
        this.brojNaDresu = brojNaDresu;
    }

    public String getPozicijaIgraca() {
        return pozicijaIgraca;
    }

    public void setPozicijaIgraca(String pozicijaIgraca) {
        this.pozicijaIgraca = pozicijaIgraca;
    }

    public boolean isDaLiJeKapiten() {
        return daLiJeKapiten;
    }

    public void setDaLiJeKapiten(boolean daLiJeKapiten) {
        this.daLiJeKapiten = daLiJeKapiten;
    }

    public void dodajKarton(Karton karton) {
        nizKartona.add(karton);
    }

    public int brZutihKartona() {
        int brojac = 0;
        for (int i = 0; i < this.nizKartona.size(); i++) {
            if (this.nizKartona.get(i).getTipKartona().equals("zuti")) {
                brojac++;


            }
        }
        return brojac;
    }

    public int brojCrveniKartona() {
        int brojac = 0;
        for (int i = 0; i < this.nizKartona.size(); i++) {
            if (this.nizKartona.get(i).getTipKartona().equals("crveni")) {
                brojac++;
            }
        }
        return brojac;
    }

    @Override
    public void stampa() {
        super.stampa();
        System.out.println("Igrac nosi broj " + this.brojNaDresu + "na dresu. ");
        System.out.println("Pozicija igraca je:  " + this.pozicijaIgraca);
        if (this.daLiJeKapiten) {
            System.out.println("Igrac je kapiten. ");
        } else {
            System.out.print("");
        }
        System.out.println("Broj zutih kartona je: " + this.brZutihKartona());
        System.out.println("Broj crvenih kartona je: " + this.brojCrveniKartona());
    }
}

