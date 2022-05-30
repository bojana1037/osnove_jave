package d30052022;

import java.util.ArrayList;

//Napisati klasu Student koja ima
//broj indeksa
//ime i prezime
//tip studija (osnovne, master, doktorske)
//niz ispita
//konstuktore koje mislite da ce vam trebati
//gettere i settere za indeks, ime i prezime, tip studija
//getter za niz predmeta
//metodu dodaj ispit u niz ispita
//metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//metodu stampaj koja stampa u formatu:
//(broj indeksa) - (ime i prezime) - (tip studija)
//Predmeti:
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//Prosecna ocena: (prosecna ocena)
public class Student {

    private int brojIndeksa;
    private String punoIme;
    private String tipStudija;
    private ArrayList<Ispit> ispiti = new ArrayList<>();

    public Student() {

    }

    public Student(int brojIndeksa, String punoIme, String tipStudija) {
        this.brojIndeksa = brojIndeksa;
        this.punoIme = punoIme;
        this.tipStudija = tipStudija;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    //metodu dodaj ispit u niz ispita
    public void dodajISpit(Ispit ispit) {
        this.ispiti.add(ispit);
    }

    int suma = 0;
    int polozeniIspiti = 0;

    //metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
    public double prosekNaStudijama(Ispit ocena) {
        for (int i = 0; i < this.ispiti.size(); i++) {
            if (this.ispiti.get(i).getOcena() > 5) {
                suma = suma + this.ispiti.get(i).getOcena();
            }
            polozeniIspiti++;
        }
        return suma / polozeniIspiti * 1.0;
    }

    ////metodu stampaj koja stampa u formatu:
    ////(broj indeksa) - (ime i prezime) - (tip studija)
    ////Predmeti:
    ////(naziv predmeta) - (profesor) - (ocena)
    ////(naziv predmeta) - (profesor) - (ocena)
    ////(naziv predmeta) - (profesor) - (ocena)
    ////Prosecna ocena: (prosecna ocena)
    public void stampa() {
        System.out.println(this.brojIndeksa + " - " + this.punoIme + " - " + this.tipStudija);
        System.out.println("Predmeti: ");

        for (int i = 0; i < ispiti.size(); i++) {
            System.out.println(this.ispiti.get(i).getNazivPredmeta() + " - " +
                    this.ispiti.get(i).getPunoImeProfesora() + " - " +
                    this.ispiti.get(i).getOcena());

        }
    }

}
