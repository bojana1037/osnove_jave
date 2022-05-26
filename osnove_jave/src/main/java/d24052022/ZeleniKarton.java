package d24052022;
//Kreirati klasu ZeleniKarton koja ima:
//ime i prezime studenta
//broj indeksa
//naziv predmeta
//ime i prezime profesora
//ocenu - od 5 do 10
//gettere i settere
//konstruktore
//metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//metodu stampaj koja stampa podatke u formatu:
//		(naziv predmeta) - (ocena)
//		Student: ime i prezime, broj indeksa
//		Profesor: ime i prezime
//
//	U glavnoj klasi:
//kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita
public class ZeleniKarton {
    private String punoImeStudenta;
    private int brIndeksa;
    private String nazivPredmeta;
    private String punoImeProfesora;
    private int ocena;

    public ZeleniKarton(){

    }
    public ZeleniKarton (String punoImeStudenta, int brIndeksa, String nazivPredmeta, String punoImeProfesora, int ocena){
        this.punoImeStudenta = punoImeStudenta;
        this.brIndeksa = brIndeksa;
        this.nazivPredmeta = nazivPredmeta;
        this.punoImeProfesora = punoImeProfesora;
        this.ocena = ocena;
    }

    public String getPunoImeStudenta() {
        return punoImeStudenta;
    }

    public void setPunoImeStudenta(String punoImeStudenta) {
        this.punoImeStudenta = punoImeStudenta;
    }

    public int getBrIndeksa() {
        return brIndeksa;
    }

    public void setBrIndeksa(int brIndeksa) {
        this.brIndeksa = brIndeksa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getPunoImeProfesora() {
        return punoImeProfesora;
    }

    public void setPunoImeProfesora(String punoImeProfesora) {
        this.punoImeProfesora = punoImeProfesora;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

   public boolean daLiJeIspitPolozen(){
        if (ocena >5){
            return true;
        }else{
            return false;
        }
   }
public void stampa (){
    System.out.println(this.nazivPredmeta + " - " + this.ocena);
    System.out.println("Student: " + this.punoImeStudenta + " , " + this.brIndeksa);
    System.out.println("Profesor: " + this.punoImeProfesora);
}

}

