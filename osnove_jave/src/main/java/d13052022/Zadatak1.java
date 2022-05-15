package d13052022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

//    Napisati program koji ima niz brojeva od 25 elemenata, koji izgleda kao tabela 5x5. Niz je fiksnih vrednosti
//     (ne unosi ih korisnik) zatim korisnik unosi poziciju za koju se racuna suma.
//    Suma za poziciju se racuna tako sto se na vrednost tog polja dodaju vrednosti elemenata iznad, ispod,
//     sleve i sdesne strane tog elementa (Ukoliko ti elementi postoje, vodite racuna da ne izadjete van opsega niza)
//    Za racunanje sume, nije potrebna petlja!
//
//    U projektu kreirati paket za ovaj domaci d13_05_2022 i u njemu klasu Zadatak1.java i
//     postavite tekst zadataka u komentaru a zatim commit-ujte promenu i push-ujte na github
//     sa porukom “Domaci 13.05.2022 Zadatak 1”
//
//    Primer izvrsenja:
//    2,4,6,7,4,
//    4,2,5,1,4,
//    1,4,9,4,5,
//    4,8,5,4,7,
//    4,4,7,4,1,
//    Unesite poziciju: 12
//    Suma je 27 (Objasnjenje: jer se sumira 9+5+4+4+5, pogledaj sliku)

     public static void main(String[] args) {
    ArrayList<Integer> niz = new ArrayList<Integer>();
         Scanner s = new Scanner(System.in);
         niz.add(1);
         niz.add(2);
         niz.add(3);
         niz.add(4);
         niz.add(5);
         niz.add(6);
         niz.add(7);
         niz.add(8);
         niz.add(9);
         niz.add(10);
         niz.add(11);
         niz.add(12);
         niz.add(13);
         niz.add(14);
         niz.add(15);
         niz.add(16);
         niz.add(17);
         niz.add(18);
         niz.add(19);
         niz.add(20);
         niz.add(21);
         niz.add(22);
         niz.add(23);
         niz.add(24);
         niz.add(25);

         for (int i = 0; i < niz.size(); i++) {
             System.out.print(niz.get(i) + ", ");
             if (i % 5 == 4){
                 System.out.println();
             }
         }

         System.out.println("Unesite poziciju: ");
         int pozicija = s.nextInt();

         int gore = niz.get(pozicija - 5);
         int dole = niz.get(pozicija + 5);
         int desno = niz.get(pozicija + 1);
         int levo = niz.get(pozicija - 1);

         if (niz.get(pozicija) == pozicija || niz.get(pozicija) > 4 ||
                 niz.get(pozicija) <= 20 || pozicija % 5 !=0 || pozicija % 5 != 4)
         {int suma = gore + dole + desno + levo + niz.get(pozicija);
             System.out.println("Suma je: " + suma);
         }





     }
}


