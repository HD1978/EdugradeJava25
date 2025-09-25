/* Lektion 4: Uppgift 4 */

public class Book {
    String title;
    String author;
    int pages;

    public Book (String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    void bokInfo() {
        System.out.println("Titel: " + title + ", författare: " + author + ", antalet sidor: " + pages);
        System.out.println();
    }
}

