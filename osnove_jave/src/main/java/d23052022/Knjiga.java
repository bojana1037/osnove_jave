package d23052022;
//Kreirati klasu Knjiga koji ima:
//-ISBN
//-naziv
//-godina izdanja
//-autor
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//(ISBN)
//(naziv) - (godina izdanja)
//autor: (ime autora) (prezime autora)
public class Knjiga {

    private String isbn;
    private String nazivKnjige;
    private int godIzdanja;
    private Autor autor;

    public Knjiga (){

    }
    public Knjiga (String isbn, String nazivKnjige, Autor autor, int godIzdanja){
        this.isbn = isbn;
        this.nazivKnjige= nazivKnjige;
        this.autor = autor;
        this.godIzdanja = godIzdanja;
    }

    public String getIsbn(){
        return isbn;
    }

    public String getNazivKnjige() {
        return nazivKnjige;
    }

    public int getGodIzdanja() {
        return godIzdanja;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setNazivKnjige(String nazivKnjige) {
        this.nazivKnjige = nazivKnjige;
    }

    public void setGodIzdanja(int godIzdanja) {
        this.godIzdanja = godIzdanja;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public void stampa(){
        System.out.println( "ISBN je: " + this.isbn);
        System.out.println("Ime knjige je: " + this.nazivKnjige + " - " + this.godIzdanja);
        this.autor.stampa();

    }

}
