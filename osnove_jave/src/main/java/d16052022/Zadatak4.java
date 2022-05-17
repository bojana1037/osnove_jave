package d16052022;
//Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se=>
/// / / / /

public class Zadatak4 {
    public static void main(String[] args) {
        metoda(5, "/");
    }

    static void metoda(int n, String karakter) {
        for (int i = 0; i < n; i++) {
            System.out.print(karakter + " ");

        }
    }
}
