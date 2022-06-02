package d02062022;
//Kreirati klasu Sektor koja ima:
// naziv sektora
// platu koja je za taj sektor
public class Sektor {

    private String nazivSektora;
    private double plata;

    public Sektor(String nazivSektora, int plata) {
        this.nazivSektora = nazivSektora;
        this.plata = plata;
    }


    public String getNazivSektora() {
        return nazivSektora;
    }

    public void setNazivSektora(String nazivSektora) {
        this.nazivSektora = nazivSektora;
    }

    public double getPlataZaSektor() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }
}
