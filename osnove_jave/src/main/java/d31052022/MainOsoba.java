package d31052022;
//U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
public class MainOsoba {
    public static void main(String[] args) {
    Igrac igrac1 = new Igrac("Nikola Nikolic", "1452638",1990, 10, "napadac", true);
    Igrac igrac2 = new Igrac("Marko Markovic", "14526389", 1985, 3, "odbrambeni", false);

    igrac1.stampa();
    igrac2.stampa();

    Trener trener1 = new Trener("Mihajlo Mihajlovic", "458796", 1975, 15, "kondicioni");
    Trener trener2 = new Trener("Aleksa Aleksic", "365263", 1960, 25, "personalni");

    trener1.stampa();
    trener2.stampa();
    }
}
