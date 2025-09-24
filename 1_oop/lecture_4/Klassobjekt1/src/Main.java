/* Lektion 4: Repetition klass och objekt */
/*
    Uppgift 1.
1.  Skapa en klass kallad Book med följande fält:
    title, author, pages
2.  Skapa en metod i klassen som skriver ut bokens
    titel och författare
    (Dessa två ovan steg är i en fil för klassen Book)

3.  Skapa ett objekt av klassen Book i main-metoden och tilldela
    värden till fälten
4.  Anropa metoden för att skriva ut bokinformationen
    (Dessa två är i en fil för main-metoden.
    Det är i denna fil.)
 */
public class Main {
    public static void main(String[] args) {
        Book myBook = new Book();           /* 3.  Ett objekt med namnet myBook skapas   */
        myBook.title = "Agenten";           // Värdet Agenten tilldelas till title i Book
        myBook.author = "John Grisham";     // Värdet John Grisham tilldelas till author i Book
        myBook.pages = 360;                 // Värdet 360 tilldelas till pages i Book

        myBook.bokInfo();                   /* 4.  Anropa metoden för att skriva ut bokinformationen  */
        // Exekveringen sker med objekt myBook som i sin tur är en
        // instans av klassen Book (steg 3.). Den går alltså in i Book för att
        // leta rätt på metoden bokInfo och kör igenom innehållet
        // som finns inom { metoden }.
    }
}