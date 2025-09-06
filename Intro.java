import java.util.Scanner;
import java.util.Arrays;

public class Intro {

    // ESERCIZIO 1
    // public static void main(String[] args) {
    // System.out.println("Si parte!");
    // // per eseguirlo mandiamo javac nome_file.java che trasmorma in bytecode
    // .class,
    // // con java nome_file eseguiamo da terminale.
    // Scanner scanner = new Scanner(System.in);

    // System.out.println("Scegli un numero");
    // int x = scanner.nextInt();
    // scanner.nextLine();
    // pari_dispari(x);

    // }

    // public static void pari_dispari(int numero) {
    // if (numero % 2 == 0) {
    // System.out.println("il numero selezionato è pari");
    // } else {
    // System.out.println("il numero selezionato è dispari");

    // }

    // }

    // ESERCIZIO 2 Creare un programma che calcoli la media dei numeri interi (pari
    // // e dispari) poi media dei pari e media dei dispari
    // public static void main(String[] args) {
    // Intro programma1 = new Intro(); // creo un oggetto cosi che posso richiamare
    // un metodo non statico atteaverso di
    // // questo
    // int[] numeri = { 105, 22, 3, 48, 5, 6, 8, 15, };
    // System.out.println("La media dell'array è pari a " +
    // programma1.media(numeri));

    // System.out.println("La media dei numeri pari dell'array è pari a " +
    // programma1.media_pari(numeri));

    // System.out.println("La media dei numeri dispari dell'array è pari a " +
    // programma1.media_dispari(numeri));

    // }

    // public int media(int[] array) {
    // int somma = 0;
    // for (int numero : array) {
    // somma += numero;
    // }
    // int media = somma / array.length;
    // return media;
    // }

    // public int media_pari(int[] array) {
    // int somma = 0;
    // for (int numero : array) {
    // if (numero % 2 == 0) {
    // somma += numero;
    // }
    // }
    // int media = somma / array.length;
    // return media;
    // }

    // public int media_dispari(int[] array) {
    // int somma = 0;
    // for (int numero : array) {
    // if (numero % 2 != 0) {
    // somma += numero;
    // }
    // }
    // int media = somma / array.length;
    // return media;
    // }

    // ESERCIZIO 3 - Creare un programma che stampi solo gli elementi in posizione
    // pari di un array
    // public static void main(String[] args) {
    // Intro programma2 = new Intro();
    // int[] numeri = { 44, 33, 2, 3, 59, 100 };

    // programma2.indice_pari(numeri);

    // }

    // public void indice_pari(int[] array) {
    // for (int i = 1; i < array.length; i++) {
    // if (i % 2 == 0) {
    // System.out.println(array[i]);
    // }
    // }
    // }

    // FACCIO PARTIRE IL CICLO FOR DA I=0 PER NON CONSIDERARE INDICE=0 COME UN
    // NUMERO PARI

    // ESERCIZIO 4 Creare un programma che stampi l'elemento maggiore in un array
    // public static void main(String[] args) {
    // int[] numeri = { 3, 50, 6, 9 };
    // System.out.println(max_value(numeri));

    // }

    // public static int max_value(int[] array) {
    // int numeromax = 0;
    // for (int numero : array) {
    // if (numero > numeromax) {
    // numeromax = numero;
    // }
    // }
    // return numeromax;
    // }

    // ESERCIZIO 5 Creare un programma che chiede un numero all'utente per poi
    // dichiarare un array con lunghezza pari al numero inserito.Successivamente
    // riempire l'array chiedendo quali numeri inserire all'utente per poi
    // calcolarne la sommatoria
    // public static void main(String[] args) {
    //     Scanner scannerpippo = new Scanner(System.in);

    //     System.out.println("Quanto deve essere lungo l'array?");
    //     int x = scannerpippo.nextInt();

    //     int[] numeri = new int[x];

    //     for (int i = 0; i < x; i++) {
    //         System.out.println("Scegli un numero");
    //         int y = scannerpippo.nextInt();
    //         scannerpippo.nextLine();
    //         numeri[i] = y;
    //     }

    //     int somma = 0;
    //     for (int numero : numeri) {
    //         somma += numero;
    //     }

    //     System.out.println("Il tuo array è " + Arrays.toString(numeri) + " e la somma dei suoi dati è pari a " + somma);

    // }

}
