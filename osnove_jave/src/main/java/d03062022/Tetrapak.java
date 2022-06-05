package d03062022;

//Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//atribut koji kaze da li se moze reciklirati
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu tako da ispunjava uslova:
//ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//ako nije u cenu ulazi samo osnovna cena
//metoda stampaj stampa sve podatke iz klase tetrapak.
public class Tetrapak extends Ambalaza {
    private boolean daLiJeZaReciklazu;
    private double osnovnaCena;

    //gettere i setter za atribute


    public boolean isDaLiJeZaReciklazu() {
        return daLiJeZaReciklazu;
    }

    public void setDaLiJeZaReciklazu(boolean daLiJeZaReciklazu) {
        this.daLiJeZaReciklazu = daLiJeZaReciklazu;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }
    //konstuktori koji su vam potrebni


    public Tetrapak(String barkod, String nazivArtikla, double netoTezina, double brutoTezina,
                    boolean daLiJeZaReciklazu, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.daLiJeZaReciklazu = daLiJeZaReciklazu;
        this.osnovnaCena = osnovnaCena;
    }

    //racuna cenu tako da ispunjava uslova:
    //ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
    //ako nije u cenu ulazi samo osnovna cena

    @Override
    public double cenaArtikla() {
        if (daLiJeZaReciklazu) {
            return this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
        } else {
            return this.osnovnaCena;
        }

        //metoda stampaj stampa sve podatke iz klase tetrapak.

//        @Override
//        public void stampa () {
//            System.out.println("Barkod je: " + this.barkod);
//            System.out.println("Naziv proizvoda je: " + this.nazivArtikla);
//            System.out.println("Neto tezina je: " + this.netoTezina);
//            System.out.println("Bruto tezina je: " + this.brutoTezina);
//            System.out.println("Osnovna cena je: " + this.osnovnaCena);
        }

    @Override
    public void stampa() {
        System.out.println("Barkod je: " + this.barkod);
            System.out.println("Naziv proizvoda je: " + this.nazivArtikla);
            System.out.println("Neto tezina je: " + this.netoTezina);
            System.out.println("Bruto tezina je: " + this.brutoTezina);
            System.out.println("Osnovna cena je: " + this.osnovnaCena);
    }
}
