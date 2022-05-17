package d16052022;

import java.util.ArrayList;
import java.util.Scanner;

//(Za vezbanje)Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
// U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
public class Zadatak6 {
    public static void main(String[] args) {

        int najmanji = najmanjiBroj(2,6,22);

        System.out.println("Najmanji broj je: " + najmanji);

    }
    static int najmanjiBroj (int a, int b, int c){

        if (a < b && a < c){
            return a;
        } else if ( b < a && b < c) {
            return b;
        } else {
            return c;
        }

    }

}
