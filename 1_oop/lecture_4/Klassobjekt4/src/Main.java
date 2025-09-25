public class Main {

    public static void main(String[] args) {

        // Skapa två objekt (firstBook och secondBook) och använd Konstruktorer

        Book firstBook = new Book("Agenten", "John Grisham", 360);
        firstBook.bokInfo();

        Book secondBook = new Book("vänaste land", "Åke Edwardson", 352);
        secondBook.bokInfo();

        Compare comparebooks = new Compare();
        comparebooks.boklength(firstBook.title, firstBook.pages, secondBook.title, secondBook.pages);
    }
}

