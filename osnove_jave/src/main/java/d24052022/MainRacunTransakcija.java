package d24052022;

public class MainRacunTransakcija {
    public static void main(String[] args) {
        Racun posiljalac = new Racun("155-46589-47", "Bojana Stojanovic", 20000);
        Racun primalac = new Racun ("225-25863-78", "Nikola Milosevic", 15000);
        System.out.println("Pre transakcije");
        posiljalac.stampa();
        primalac.stampa();
        System.out.println(" ");

        Transakcija prva = new Transakcija(254, posiljalac, primalac);

        prva.izvrsiTransakciju(11500);
        System.out.println("Nakon transakcije: ");
        posiljalac.stampa();
        primalac.stampa();
        prva.stampa();
    }
}
