package d03062022;
//Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//        kaucija za flasu
//        atribut koji kaze da li se za flasu placa kaucija
//        osnovna cena
//        gettere i setter za atribute
//        konstuktori koji su vam potrebni
//        racuna cenu
//        ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//        ako se ne placa, (osnovna cena) * 1.2
//        metoda stampaj stampa sve podatke iz klase staklena flasa.

public class StaklenaAmbalaza extends Ambalaza{
    private double kaucija;
    private boolean daLiSePlacaKaucija;
    private double osnovnaCena;

    //        gettere i setter za atribute


    public double getKaucija() {
        return kaucija;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isDaLiSePlacaKaucija() {
        return daLiSePlacaKaucija;
    }

    public void setDaLiSePlacaKaucija(boolean daLiSePlacaKaucija) {
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }
    //        konstuktori koji su vam potrebni


    public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina,
                            double kaucija, boolean daLiSePlacaKaucija, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
        this.osnovnaCena = osnovnaCena;
    }
    //        racuna cenu
    //        ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
    //        ako se ne placa, (osnovna cena) * 1.2
    @Override
    public double cenaArtikla(){
        if(daLiSePlacaKaucija){
            return this.osnovnaCena * 1.2 + this.kaucija;
        }else{
            return this.osnovnaCena * 1.2;
        }
        //        metoda stampaj stampa sve podatke iz klase staklena flasa.

        }

    @Override
    public void stampa() {
        System.out.println("Kaucija iznosi: " + this.kaucija);
        System.out.println("Osnovna cena iznosi: " + this.osnovnaCena);
    }
}

