/* Lektion 4: Repetition klass och objekt */
/*
    Uppgift 1.
1.  Skapa en klass kallad Book med följande fält:
    title, author, pages
2.  Skapa en metod i klassen som skriver ut bokens
    titel och författare
    (Dessa två ovan steg är i en fil för klassen Book.
    Det är i denna fil)

3.  Skapa ett objekt av klassen Book i main-metoden och tilldela
    värden till fälten
4.  Anropa metoden för att skriva ut bokinformationen
    (Dessa två är i en fil för main-metoden)
 */

public class Book {         /*   1.  Skapa en klass som heter Book */
    String title;                       // bokens titel
    String author;                      // bokens författare
    int pages;                          // antalet sidor i boken

    void bokInfo() {   /*   2.  Skapa en metod som skriver ut bokinfo i klassen Book. Metoden får heta bokInfo   */
        System.out.println("Titel: " + title);
        System.out.println("Författare:: " + author);
        System.out.println("Sidor: " + pages);
    }
}
