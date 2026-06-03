package es03;

import java.util.Scanner;

public class es03 {
    public static void main(String[] args) {
        /*#Esercizio #4 - for
Scrivere un programma che gestisca un conto alla rovescia per il lancio
di un razzo spaziale. Il sistema riceve in input i secondi totali
dall'utente. Se il valore inserito è negativo deve essere convertito in
positivo, mentre se supera il limite di sicurezza di 20 secondi deve
essere forzato a 20.

Scrivere un metodo che dato il numero di secondi restituisca un'unica*/
        launcherRocket();

    }

    public static void launcherRocket() {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Insert launch seconds:");

        int myLauncherTime = myScanner.nextInt();

        if (myLauncherTime < 0) {
            myLauncherTime = Math.abs(myLauncherTime);
        }

        if (myLauncherTime > 20) {
            myLauncherTime = 20;
        }

        for (int i = myLauncherTime; i >= 0; i--) {
            System.out.println("Seconds to launch: " + i);
        }

        System.out.println("[OK] Rocket launched!");
    }
}

