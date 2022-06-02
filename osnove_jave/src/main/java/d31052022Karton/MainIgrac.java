package d31052022Karton;
//U glavnom programu kreirati igraca i dodati mu nekoliko kartona.
public class MainIgrac {
    public static void main(String[] args) {
        Igrac igrac1 = new Igrac("Matija Matijvic", "0125845", 1977, 12, "odbrana", false);

        Karton karton1 = new Karton("zuti");
        Karton karton2 = new Karton("crveni");

        igrac1.dodajKarton(karton1);
        igrac1.dodajKarton(karton2);
        igrac1.dodajKarton(karton1);
        igrac1.stampa();
    }
}
