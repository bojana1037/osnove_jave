package d23052022;

public class MainAutorKnjiga {
    public static void main(String[] args) {

        Autor autor = new Autor("Pol", "Jang");
        Knjiga knjiga = new Knjiga("3355","Koliba",autor,2005);


        Autor autor2 = new Autor();
        autor2.setImeAutora("Vladimir");
        autor2.setPrezimeAutora("Kecmanovic");


        Knjiga knjiga2 = new Knjiga();
        knjiga2.setIsbn("123456");
        knjiga2.setNazivKnjige("Kainov oziljak");
        knjiga2.setGodIzdanja(2007);
        knjiga2.setAutor(autor2);

        autor.stampa();
        knjiga.stampa();
        System.out.println(" ");
        autor2.stampa();
        knjiga2.stampa();
        System.out.println(" ");
    }
}


