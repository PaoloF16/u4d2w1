package es01;

import java.util.Scanner;

public class es01 {
    public static void main(String[] args) {
        /*
        * Esercizio #1 - if-else if
        Scrivere i seguenti metodi:
        - stringaPariDispari, che accetta una stringa e ritorna true se il numero di caratteri è pari e false se il numero di
          caratteri è dispari.
        - annoBisestile, che accetta un anno espresso come intero e ritorna true se esso è bisestile, false altrimenti.
          [Un anno per essere bisestile deve rispettare le seguenti regole:
        - essere divisibile per 4
        - qualora sia divisibile per 100 deve essere anche divisibile per 400

         Scrivere un main che utilizzi i metodi.
        * */
        System.out.println(stringaPariDispari("Hello"));
        System.out.println(annoBisestile());

    }

    public static boolean stringaPariDispari(String myString) {
        if (myString.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean annoBisestile() {
        boolean yearChecker;
        Scanner myYearScanner = new Scanner(System.in);
        int myYear = myYearScanner.nextInt();
        if (myYear % 4 == 0 && myYear % 100 == 0 && myYear % 400 == 0) {
            yearChecker = true;
            return yearChecker;
        } else {
            yearChecker = false;
            return yearChecker;
        }
    }
    

}
