package d24052022;
//    Kreirati klasu Transakcija koja ima:
//    id transakcije
//    racun sa kog se prenose sredstva
//    racun na koji se prenose sredstva
//    gettere i settere
//            konstruktore
//    privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//    ako je prenos sredstava manji od 4500, provizija je fiksna 45
//    ako je prenos sredstava veci od 4500, provizija je 1%
//    S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar koji predstavlja visinu transakcije
//    Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
//    metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije
//    se unosi vrednost koja se prebacuje.
//    Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi racun dodaje samo (trazena suma).
//    (Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
//    metodu koja stampa podatke o transakciji u formatu:
//    id transkacije
//    Racun sa: Ime i prezime  -  broj racuna
//    Racun na: Ime i prezime  -  broj racuna
public class Transakcija {
    private int id;
    private Racun posiljalac;
    private Racun primalac;

    public Transakcija(int id, Racun posiljalac, Racun primalac) {
        this.id = id;
        this.posiljalac = posiljalac;
        this.primalac = primalac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Racun getPosiljalac() {
        return posiljalac;
    }

    public void setPosiljalac(Racun posiljalac) {
        this.posiljalac = posiljalac;
    }

    public Racun getPrimalac() {
        return primalac;
    }

    public void setPrimalac(Racun primalac) {
        this.primalac = primalac;
    }

    private double provizija(double visinaTransakcije) {
        if (visinaTransakcije < 4500.0) {
            return 45.0;
        } else {
            return visinaTransakcije * 0.1;
        }
    }

    public void izvrsiTransakciju(double visinaTransakcije) {
        if (this.getPosiljalac().getStanjeNaRacunu() > visinaTransakcije) {
            this.getPosiljalac().promenaStanjaNaRacunu(this.getPosiljalac().getStanjeNaRacunu()- (visinaTransakcije + this.provizija(visinaTransakcije)));
            this.getPrimalac().promenaStanjaNaRacunu(this.getPrimalac().getStanjeNaRacunu() + visinaTransakcije);
        } else {
            System.out.println("Nemate dovoljno sredstava.");
        }
    }
    public void stampa(){
        System.out.println("Transakcija " + this.id);
        System.out.println("Sa racuna: " + this.posiljalac.getImeIPrezime() + " - " + this.posiljalac.getStanjeNaRacunu());
        System.out.println("Na racun: " + this.primalac.getImeIPrezime() + " - " + this.primalac.getStanjeNaRacunu());
    }

}
