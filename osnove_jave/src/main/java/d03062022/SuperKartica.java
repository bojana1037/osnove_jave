package d03062022;
//Kreirati klasu SuperKartica koja ima:
//broj kartice
//ime i prezime vlasnika
//popust (200, 500, … )
//konstuktore (default-ni i sa parametrima)
//gettere i settere
//metodu stampaj koja stampa karticu u formatu:
//(broj kartice), (ime i prezime)
public class SuperKartica {
    private String brojKartice;
    private String punoImeVlasnika;
    private double popust;

    //konstuktore (default-ni i sa parametrima)

    public SuperKartica(){

    }
    public SuperKartica(String brojKartice, String punoImeVlasnika, double popust) {
        this.brojKartice = brojKartice;
        this.punoImeVlasnika = punoImeVlasnika;
        this.popust = popust;
    }
    //gettere i settere

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getPunoImeVlasnika() {
        return punoImeVlasnika;
    }

    public void setPunoImeVlasnika(String punoImeVlasnika) {
        this.punoImeVlasnika = punoImeVlasnika;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }
    //metodu stampaj koja stampa karticu u formatu:
    //(broj kartice), (ime i prezime)

    public void stampa(){
        System.out.println("Broj kartice je: " + this.brojKartice + " , " + "ime i prezime: " + this.punoImeVlasnika);
    }
}
