package d03062022;

import java.util.ArrayList;

//Kreirati klasu Korpa koja ima:
//niz ambalaza
//metodu dodaj ambalazu
//metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
//metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se
// prima Super karticu iz koje se cita popust.
public class Korpa {
    ArrayList<Ambalaza>nizAmbalaze= new ArrayList<>();
    public void dodajAmbalazu(Ambalaza ambalaza){
        nizAmbalaze.add(ambalaza);
    }

    //metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti

    private void izbaciAmbalazu(String barkod){
        for (int i = 0; i < nizAmbalaze.size(); i++) {
            if (nizAmbalaze.get(i).equals(barkod)){
                nizAmbalaze.remove(i);
            }
        }
        //privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.

        private double cenaKorpeSaPopustom(double popust){
            double suma = 0;
            for (int i = 0; i < nizAmbalaze.size(); i++) {
                suma+= nizAmbalaze.get(i).cenaArtikla() - popust;
            }
        }

        //metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se
// prima Super karticu iz koje se cita popust.

        public double ukupnaCenaKorpe (SuperKartica kartica1){
           return cenaKorpeSaPopustom(kartica1.getPopust());
    }
}
}