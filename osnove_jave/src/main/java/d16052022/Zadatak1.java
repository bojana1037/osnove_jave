package d16052022;

//Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
// Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

public class Zadatak1 {
    public static void main(String[] args) {
        stampajVrednostZa10Vecu(10);
    }

    static void stampajVrednostZa10Vecu(int broj) {
        int a = broj;
        int vrednost = broj + 10;
        System.out.println("Stampana vrednost je " + vrednost);
    }
}

