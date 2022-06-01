package d31052022;
//Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//godine iskustva
//tip trenera (kondicioni, za igru, pomocni, personalni)
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
public class Trener extends Osoba {
    private int godIskustva;
    private String tipTrenera;

    public Trener(String punoIme, String jmbg, int godRodjenja, int godIskustva, String tipTrenera) {
        super(punoIme, jmbg, godRodjenja);
        this.godIskustva = godIskustva;
        this.tipTrenera = tipTrenera;
    }

    @Override
    public void stampa(){
        super.stampa();
        System.out.println("Trener ima " + this.godIskustva + " god iskustva. ");
        System.out.println(" Trener je " + this.tipTrenera);
    }
}
