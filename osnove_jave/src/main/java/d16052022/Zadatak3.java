package d16052022;
//Napisati metodu koja stampa podatke o korisniku u formatu:
//JMBG: [jmbg]
//Ime: [ime]
//Prezime: [prezime]
//God. rodjenja: [god]
//Aktivan: [true/false]
//Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.

public class Zadatak3 {
    public static void main(String[] args) {
        podacioKorisniku("1234567890123", "Bojana", "Stojanovic", 1988, true);

    }

    static void podacioKorisniku(String jmbg, String ime, String prezime, int god, boolean aktivan) {
        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("God.rodjenja: " + god);
        System.out.println("Aktivan: " + aktivan);
    }

}


