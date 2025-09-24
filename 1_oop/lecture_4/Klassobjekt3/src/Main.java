public class Main {
    public static void main(String[] args) {

        // Ett bokobjekt
        Book firstBook = new Book();           /*  Ett objekt med namnet firstBook skapas   */
        firstBook.title = "Agenten";           // Värdet Agenten tilldelas till title i Book
        firstBook.author = "John Grisham";     // Värdet John Grisham tilldelas till author i Book
        firstBook.pages = 360;                 // Värdet 360 tilldelas till pages i Book
        firstBook.language = "Svenska";        // Värdet Svenska tilldelas till language i Book
        firstBook.genre = "Thriller";           // Värdet Deckare tilldelas till genre i Book

        firstBook.bokInfo();                   // Anropa metoden för att skriva ut bokinformationen
        firstBook.readTime();                  // Anropa metoden readTime för att visa tiden att läsa boken
        firstBook.bokGenre();                  // Anropa metoden bokGenre för att kontrollera genre

        System.out.println();

        // Ett till bokobjekt
        Book secondBook = new Book();
        secondBook.title = "vänaste land";
        secondBook.author = "Åke Edwardson";
        secondBook.pages = 352;
        secondBook.language = "Svenska";
        secondBook.genre = "Deckare";

        secondBook.bokInfo();
        secondBook.readTime();
        secondBook.bokGenre();
    }
}