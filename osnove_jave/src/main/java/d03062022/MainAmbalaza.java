package d03062022;
//U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza
// razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.
public class MainAmbalaza {
    public static void main(String[] args) {


    Korpa korpa1 = new Korpa();

    Ambalaza tetrapak = new Tetrapak("457", "sok", 300, 310,
            true, 300);
    Ambalaza staklenaAmbalaza = new StaklenaAmbalaza("4587", "vino", 750, 840,
            200, true, 1900);

    SuperKartica kartica1 = new SuperKartica("335", "Bojana Stojanovic", 50);

        korpa1.dodajAmbalazu(tetrapak);
        korpa1.dodajAmbalazu(staklenaAmbalaza);


        System.out.println("Ukupna cena korpe sa popustom je: " + korpa1.ukupnaCenaKorpe(kartica1));

}
}
