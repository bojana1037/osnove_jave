package d16052022;
// (Za vezbanje )Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//Primer izvrsenja:
//izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
//
//Napomena: Resiti bez koriscenja petlji.

public class Zadatak5 {
    public static void main(String[] args) {
        int suma = kolikoJeCelihBrojeva(-5, 1);
        System.out.println("Ukupno celih brojeva izmedji m i n je: " + suma);
    }

    static int kolikoJeCelihBrojeva(int m, int n) {
        if (m > n) {
            return (m - n - 1);
        } else {
            return (n - m - 1);

        }
    }
}
