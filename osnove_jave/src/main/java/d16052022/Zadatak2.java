package d16052022;
//Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost
// koja se formira kao na primeru:
//ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost za a: ");
        String a = s.next();
        System.out.println("Unesite vrednost za b: ");
        String b = s.next();
        String brojevi = novaVrednost(a,b);
        System.out.println(" Nova vrednost je: " + brojevi);
    }

    static String novaVrednost(String a, String b) {
        return a + b;

    }
}

