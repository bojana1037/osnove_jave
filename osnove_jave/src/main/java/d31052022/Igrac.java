package d31052022;
//Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//broj (broj koji igrac nosi)
//poziciju koju igra (odbrambeni, napadac, … )
//kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere za broj, kapiten i poziciju
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
public class Igrac extends Osoba{
    private int brojNaDresu;
    private String pozicijaIgraca;
    private boolean daLiJeKapiten;



    public Igrac(String punoIme, String jmbg, int godRodjenja, int brojNaDresu, String pozicijaIgraca, boolean daLiJeKapiten) {
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

    @Override
    public void stampa(){
        super.stampa();
        System.out.println("Broj na dresu je: " + this.brojNaDresu);
        System.out.println("Pozicija igraca je: " + this.pozicijaIgraca);
        if (this.daLiJeKapiten) {
            System.out.println("Igrac je kapiten. ");
        } else {
            System.out.print("");
        }
    }
}
