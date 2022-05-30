package d30052022;

public class MainStudentIspiti {

    public static void main(String[] args) {



        Ispit monetarnaEkonomija = new Ispit("Monetarna ekonomija", 7, "Jadranka Djurovic");
        Ispit finansijskoRacunovodstvo = new Ispit("Finansijsko racunovodstvo", 9, "Blagoje Novicevic");
        Ispit javneFinansije = new Ispit("Javne finansije", 10, "Ljiljana Boncic");

        Student student1 = new Student(39145, "Bojana Stojanovic", "Master");

        student1.dodajISpit(monetarnaEkonomija);
        student1.dodajISpit(finansijskoRacunovodstvo);
        student1.dodajISpit(javneFinansije);
        student1.stampa();


    }
}
