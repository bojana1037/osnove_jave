package d23052022;
//Kreirati klasu Autor koja ima
//-ime i prezime
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu:
//(ime autora) (prezime autora)
public class Autor {
    private String imeAutora;
    private String prezimeAutora;

    public Autor(){

    }
    public Autor(String imeAutora, String prezimeAutora) {
        this.imeAutora = imeAutora;
        this.prezimeAutora = prezimeAutora;
    }

    public String getPunoImeAutora() {
        return imeAutora;
    }

    public String getPrezimeAutora() {
        return prezimeAutora;
    }

    public void setImeAutora(String imeAutora) {
        this.imeAutora = imeAutora;
    }

    public void setPrezimeAutora(String prezimeAutora) {
        this.prezimeAutora = prezimeAutora;
    }

    public void stampa(){
        System.out.println("Ime i prezime autora: " + this.imeAutora + " " + this.prezimeAutora);
    }
}

