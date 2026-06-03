package es02;

import java.util.Scanner;

public class es02 {
    public static void main(String[] args) {
        /*
        * Esercizio #2 - switch
Scrivere un programma che chiede un intero in ingresso e lo stampa in lettere se il valore è compreso tra 0 e 3,
altrimenti stampa un messaggio d'errore usando il costrutto switch.

Esercizio #3 - while
Scrivere un programma che chiede di inserire una stringa e la suddivida in caratteri separati dalla virgola. II
programma si ripete fino a che l'utente non inserisce la stringa ":q" (per comparare due stringhe usare il metodo
.equals() delle stringhe)
        * */
        stampaNumero();
        separateStrings();
    }

    public static void stampaNumero() {
        Scanner myNumberScanner = new Scanner(System.in);
        int myNumber = myNumberScanner.nextInt();
        switch (myNumber) {
            case 0:
                System.out.println("Your number is : zero");
                break;
            case 1:
                System.out.println("Your number is : one");
                break;
            case 2:
                System.out.println("Your number is : two");
                break;
            case 3:
                System.out.println("Your number is : third");
                break;
            default:
                System.out.println("Your number is out of expected ");
        }
        ;
    }

    public static void separateStrings() {
        Scanner myScanner = new Scanner(System.in);
        String myString = myScanner.nextLine();
        do {

            System.out.println("Insert a text");

            myString = myScanner.nextLine();

            if (!myString.equals(":q")) {// si myString no sea :q

                String myNewString = myString.replace("", ",");

                System.out.println(myNewString);

            }

        }
        while (!myString.equals(":q"));// mientras myString no sea :q

    }
}
