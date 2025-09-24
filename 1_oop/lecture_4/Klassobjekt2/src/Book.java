/* Lektion 4: Uppgift 2 */

import java.util.Scanner;

public class Book {         // klassen Book med dess egenskaper (attribut)
    String title;           // bokens titeln
    String author;          // författare
    int pages;              // antalet sidor
    String language;        // vilket språk

    void bokInfo() {   /*    Metoden får heta bokInfo   */
        System.out.println("Titel: " + title);
        System.out.println("Författare: " + author);
        System.out.println("Sidor: " + pages);
        System.out.println("Språk: " + language);
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
}


