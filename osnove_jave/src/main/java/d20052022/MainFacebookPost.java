package d20052022;
//    public String objavio;
//    public String naKomProfilu;
//    public String tekst;
//    public int lajkovi;
//    public int deljenje;
//
//    public void like() {
//        this.lajkovi++;
//    }
//
//    public FacebookPost () {}
//
//    public FacebookPost (String objavio, String naKomProfilu, String tekst){
//        this.objavio = objavio;
//        this.naKomProfilu = naKomProfilu;
//        this.tekst = tekst;
//
//    }
//
//    public void dislike() {
//        this.lajkovi--;
//        if (this.lajkovi < 0) {
//            this.lajkovi = 0;
//        }
//    }
//
//    public void share() {
//        this.deljenje++;
//    }
//
//    public void print() {
//        System.out.println(this.objavio + " >>> " + this.naKomProfilu);
//        System.out.println(this.tekst);
//        System.out.println("Likes " + this.lajkovi + " | Shares " + this.deljenje);
//    }
//}
public class MainFacebookPost {

    public static void main(String[] args) {

        FacebookPost prvi = new FacebookPost();
        prvi.imeKoObjavljuje = "Bojana Stojanovic";
        prvi.imeNaKomProfilu = "Marko Nikolic";
        prvi.tekst = "Kada stizu sertifikati za bootcamp?";
        prvi.lajkovi = 300;
        prvi.deljenje = 32;

        FacebookPost drugi = new FacebookPost("Nevena Josipovic", "Milos Milinkovic", "Cestitamo!");
        drugi.lajkovi = 555;
        drugi.deljenje = 2;

        prvi.like();
        prvi.like();
        prvi.like();

        drugi.dislike();
        drugi.dislike();


        drugi.share();

        prvi.print();
        System.out.println();
        drugi.print();
    }
}


