package d24052022;

import java.util.ArrayList;

//	U glavnoj klasi:
//kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita
public class MainZeleniKarton {
    public static void main(String[] args) {
        ArrayList<ZeleniKarton> ispiti = new ArrayList<ZeleniKarton>();

        ZeleniKarton ispit1 = new ZeleniKarton("Bojana Stojanovic",
                39145,
                "priroda i drustvo",
                "Vladimir Minic",
                7);

        ispiti.add(ispit1);

        ZeleniKarton ispit2 = new ZeleniKarton("Bojana Stojanovic",
                39145,
                "muzicka kultura",
                "Milan Jovanovic",
                6);

        ispiti.add(ispit2);

        ZeleniKarton ispit3 = new ZeleniKarton("Bojana Stojanovic",
                39145,
                "fizicko vaspitanje",
                "Vladimir Minic",
                7);

        ispiti.add(ispit3);

        ZeleniKarton ispit4 = new ZeleniKarton("Bojana Stojanovic",
                39145,
                "srpski jezik i knjizevnost",
                "Milan Jovanovic",
                9);

        ispiti.add(ispit4);

        ZeleniKarton ispit5 = new ZeleniKarton("Bojana Stojanovic",
                39145,
                "psihologija",
                "Vladimir Minic",
                10);

        ispiti.add(ispit5);

        ZeleniKarton ispit6 = new ZeleniKarton("Bojana Stojanovic",
                39145,
                "informatika",
                "Milan Jovanovic",
                10);

        ispiti.add(ispit6);

        ZeleniKarton ispit7 = new ZeleniKarton("Bojana Stojanovic",
                39145,
                "likovna kultura",
                "Vladimir Minic",
                6);

        ispiti.add(ispit7);

        ZeleniKarton ispit8 = new ZeleniKarton("Bojana Stojanovic",
                39145,
                "sociologija",
                "Milan Jovanovic",
                10);

        ispiti.add(ispit8);

        ZeleniKarton ispit9 = new ZeleniKarton("Bojana Stojanovic",
                39145,
                "elektronsko poslovanje",
                "Vladimir Minic",
                9);

        ispiti.add(ispit9);

        ZeleniKarton ispit10 = new ZeleniKarton("Bojana Stojanovic",
                39145,
                "hemija",
                "Milan Jovanovic",
                8);

        ispiti.add(ispit10);

        for (int i = 0; i < 10; i++) {
            ispiti.get(i).stampa();
            System.out.println();

        }

        int suma = 0;

        for (int i = 0; i < ispiti.size(); i++) {
            suma = suma + ispiti.get(i).getOcena();
        }

        double prosecnaOcena = suma / ispiti.size();
        System.out.println("Prosecna ocena je: " + prosecnaOcena);
        System.out.println();

        suma = 0;
        for (int i = 0; i < ispiti.size(); i++) {
            if (ispiti.get(i).daLiJeIspitPolozen() == true) {
                suma = suma + ispiti.get(i).getOcena();
            } else {
                suma = suma + 0;
            }
        }

        double prosekPozitivnihOcena = suma / ispiti.size();

        System.out.println("Prosek prelaznih ocena je: " + prosekPozitivnihOcena);
    }

}





