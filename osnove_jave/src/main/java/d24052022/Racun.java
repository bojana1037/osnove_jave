package d24052022;
//    Kreirati klasu Racun koja ima:
//    broj racuna (npr: 170-289328923-23)
//    ime i prezime osobe
//    trenutno stanje na racunu (npr: 100, 1220)
//    gettere i setter za sve atribute, sem settera za stanje na racunu
//    metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)
//    metodu koja stampa podatke o racunu u formatu:
//    Ime i prezime  -  broj racuna
//    stanje na racunu je (trenutno stanje) rsd.
public class Racun {

        private String brRacuna;
        private String imeIPrezime;
        private double stanjeNaRacunu;

        public Racun(String brRacuna, String imeIPrezime, double stanjeNaRacunu) {
            this.brRacuna = brRacuna;
            this.imeIPrezime = imeIPrezime;
            this.stanjeNaRacunu = stanjeNaRacunu;
        }

        public String getBrRacuna() {
            return brRacuna;
        }

        public void setBrRacuna(String brRacuna) {
            this.brRacuna = brRacuna;
        }

        public String getImeIPrezime() {
            return imeIPrezime;
        }

        public void setImeIPrezime(String imeIPrezime) {
            this.imeIPrezime = imeIPrezime;
        }

        public double getStanjeNaRacunu() {
            return stanjeNaRacunu;
        }

//    public void promenaStanjaNaRacunu (double promenaStanja){
//        this.stanjeNaRacunu = promenaStanja;
//        if (this.stanjeNaRacunu < 0.0){
//            this.stanjeNaRacunu = 0.0;
//        }
        public boolean promenaStanjaNaRacunu(int promena){
            if (this.stanjeNaRacunu + promena < 0){
                System.out.println("Stanje racuna ne moze biti negativno");
                return false;
            }else {
                stanjeNaRacunu = stanjeNaRacunu + promena;
                return true;
            }
        }
        public void stampa(){
            System.out.println("Ime i prezime: " + this.imeIPrezime + " - " + this.brRacuna);
            System.out.println("Stanje na racunu je: " + this.getStanjeNaRacunu() + "rsd");
        }


    }
