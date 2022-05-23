package d18052022;

public class MainSmart {
    public static void main(String[] args) {
        Smart klima1 = new Smart();

        klima1.markaKlime = "Samsung";
        klima1.temperatura = 20;
        klima1.mod = "hladjenja";

        klima1.stampa();

        Smart klima2 = new Smart();

        klima2.markaKlime = "Gree";
        klima2.temperatura = 30;
        klima2.mod = "grejanja";

        klima2.stampa();
    }
}
