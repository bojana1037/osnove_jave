package d31052022Karton;
//Kreirati klasu Osoba koja ima:
//ime i prezime
//jmbg
//godinu rodjenja
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere
//metodu stampaj koja stampa u formatu:
//(ime i prezime), (jmbg), (godina rodjenja)
public class Osoba {
    private String punoIme;
    private String jmbg;
    private int godRodjenja;

    public Osoba(){

    }

    public Osoba(String punoIme, String jmbg, int godRodjenja) {
        this.punoIme = punoIme;
        this.jmbg = jmbg;
        this.godRodjenja = godRodjenja;
    }

    public void stampa(){
        System.out.println(this.punoIme + " , " + this.jmbg + " , " + this.godRodjenja);
    }
}
