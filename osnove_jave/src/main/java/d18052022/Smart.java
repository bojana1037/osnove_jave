package d18052022;

//Kreirati klasu SmartAirConditioning koja ima:
//atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//atribut za mod (hladi/greje)
//metodu za stampu - stampa u formatu: Proizvoljno :)
//
//
//U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metodu za stampu
public class Smart {

    String markaKlime;
    int temperatura;
    String mod;

    public void stampa() {
        System.out.println("Marka klime " + this.markaKlime + " je ukljucena na mod " + this.mod +
                " na temperaturu od " + this.temperatura + " stepeni.");
    }
}
