package d20052022;

public class FacebookPost {

    public String imeKoObjavljuje;
    public String imeNaKomProfilu;
    public String tekst;
    public int lajkovi;
    public int deljenje;

    public void like() {
        this.lajkovi++;
    }

    public FacebookPost () {}

    public FacebookPost (String imeKoObjavljuje, String imeNaKomProfilu, String tekst){
        this.imeKoObjavljuje = imeKoObjavljuje;
        this.imeNaKomProfilu = imeNaKomProfilu;
        this.tekst = tekst;

    }

    public void dislike() {
        this.lajkovi--;
        if (this.lajkovi < 0) {
            this.lajkovi = 0;
        }
    }

    public void share() {
        this.deljenje++;
    }

    public void print() {
        System.out.println(this.imeKoObjavljuje + " >>> " + this.imeNaKomProfilu);
        System.out.println(this.tekst);
        System.out.println("Likes " + this.lajkovi + " | Shares " + this.deljenje);
    }
}

