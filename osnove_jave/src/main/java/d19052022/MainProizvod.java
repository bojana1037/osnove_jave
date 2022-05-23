package d19052022;

//Napisati klasu Proizvod koja ima atribute
//naziv proizvoda (String)
//cenu proizvoda (double)
//težinu proizvoda u gramima. (double)
//	i metode:
//stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//za tezinu do 100g, postarina iznosi 200din
//za tezinu od 101g do 500g, postarina iznosi 400din
//za tezinu preko 500g, postarina iznosi 1000din
//
//U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.
public class MainProizvod {
    public static void main(String[] args) {
        Proizvod puding = new Proizvod();

        puding.nazivProizvoda = " C puding";
        puding.cenaProizvoda = 50;
        puding.tezinaUGramima = 10;
        puding.stampa();

        puding.povecajCenu(2);
        System.out.println(" Cena pudinga posle povecanja je: " );
        puding.stampa();

        Proizvod slag = new Proizvod();

        slag.nazivProizvoda = "C slag";
        slag.cenaProizvoda = 55;
        slag.tezinaUGramima = 100;
        slag.stampa();

        slag.povecajCenu(3);
        System.out.println(" Cena slaga posle povecanja je: " );
        slag.stampa();

        System.out.println("Cena sa popustom za puding je: " + puding.vratiCenuSaPopustom(10));
        System.out.println("Cena sa popustom za slag je: " + slag.vratiCenuSaPopustom(40));
        System.out.println("Cena postarine za puding je: " + puding.racunajPostarinu());
        System.out.println("Cena postarine za slag je: " + slag.racunajPostarinu());

    }


}

