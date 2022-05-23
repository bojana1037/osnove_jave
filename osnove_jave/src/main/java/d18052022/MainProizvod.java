package d18052022;
//Napisati klasu Proizvod koja ima atribute
//naziv proizvoda (String)
//cenu proizvoda (double)
//težinu proizvoda u gramima. (double)
//	i metode:
//stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//
//
//U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metodu za stampu.
public class MainProizvod {

    public static void main(String[] args) {
        Proizvod vanilinSecer = new Proizvod();
        vanilinSecer.nazivProizvoda = "Vanilin secer";
        vanilinSecer.cenaProizvoda = 10.5;
        vanilinSecer.tezinaProizvodaUGramima = 5.5;

        vanilinSecer.stampa ();

        Proizvod cimet = new Proizvod();
        cimet.nazivProizvoda = "Cimet";
        cimet.cenaProizvoda = 15.5;
        cimet.tezinaProizvodaUGramima = 5.5;

        cimet.stampa();
    }
}
