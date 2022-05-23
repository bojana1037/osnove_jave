package d19052022;

public class Proizvod {
    String nazivProizvoda;
    double cenaProizvoda;
    double tezinaUGramima;


    public void stampa() {
        System.out.println(" Naziv proizvoda: " + this.nazivProizvoda + " , " + "cena: " +
                this.cenaProizvoda + " , " + "tezina: " + this.tezinaUGramima);
    }

    public void povecajCenu(int povecanje) {
        this.cenaProizvoda = this.cenaProizvoda + povecanje;
    }


    public double vratiCenuSaPopustom(double popust) {
        return this.cenaProizvoda - this.cenaProizvoda * popust / 100;

    }

    public int racunajPostarinu() {
        if (this.tezinaUGramima <= 100) {
            return 200;
        } else if (this.tezinaUGramima > 100 && this.tezinaUGramima <= 500) {
            return 400;
        } else {
            return 1000;

        }
    }
}

