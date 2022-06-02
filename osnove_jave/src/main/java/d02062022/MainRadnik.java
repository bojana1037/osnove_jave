package d02062022;

import java.util.ArrayList;

//U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u kojima rade
// i ispisati platu za svakog
public class MainRadnik {
    public static void main(String[] args) {
        Sektor nabavka = new Sektor("Nabavka", 1000000);
        Sektor finansije = new Sektor("Finansije", 500000);

        Radnik radnik1 = new Menadzer();
        radnik1.punoIme = "MArko Markovic";
        radnik1.zaposliUsektor(nabavka);
        radnik1.zaposliUsektor(finansije);

        Radnik radnik2 = new Magacioner();
        radnik2.punoIme = "Nikola Nikolic";
        radnik2.zaposliUsektor(nabavka);
        radnik2.zaposliUsektor(finansije);

        ArrayList<Radnik> nizRadnika = new ArrayList<>();
        nizRadnika.add(radnik1);
        nizRadnika.add(radnik2);


        for (int i = 0; i < nizRadnika.size(); i++) {
            Radnik radnik = nizRadnika.get(i);
            System.out.println("Plata za " + radnik.punoIme + " je: " + radnik.plata());
        }
    }
}
