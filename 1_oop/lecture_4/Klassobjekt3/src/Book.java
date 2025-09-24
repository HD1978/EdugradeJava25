/* Lektion 4: Uppgift 3 */

import java.util.Scanner;

public class Book {         // klassen Book med dess egenskaper (attribut)
    String title;           // bokens titeln
    String author;          // författare
    int pages;              // antalet sidor
    String language;        // vilket språk
    String genre;           // bokens genre

    void bokInfo() {   /*    Metoden får heta bokInfo   */
        System.out.println("Titel: " + title);
        System.out.println("Författare: " + author);
        System.out.println("Sidor: " + pages);
        System.out.println("Språk: " + language);
        System.out.println("Genre: " + genre);
        System.out.println();
    }

    void readTime() {       // skapa en metod med namnet readTime (hur lång tid det tar att läsa boken)
        Scanner sc = new Scanner(System.in);
        System.out.print("Hur många sidor läser du varje dag? ");
        int pagesPerDay = sc.nextInt();    // antalet sidor som man läser varje dag

        // tid att läsa klart boken = antalet sidor / sidor per day
        int days = pages / pagesPerDay;
        System.out.println("Det kommer att ta ca " + days + " dagar att läsa klart boken.");
        System.out.println();
    }

    void bokGenre() {
        // Lista över tänkbara genrer
        String refGenre1 = "Deckare";
        String refGenre2 = "Thriller";

        /* Kontrollera textsträngen Deckare mot genre som i sin tur erhölls från Main.
        Metoden equals() används för att jämföra String mot varandra
        och genererar true eller false för resultatet */
        boolean compGenre1 = genre.equals(refGenre1);
        boolean compGenre2 = genre.equals(refGenre2);
        System.out.println("Är boken i genre Deckare? Svar: " + compGenre1);
        System.out.println("Är boken i genre Thriller? Svar: " + compGenre2);
    }
}


