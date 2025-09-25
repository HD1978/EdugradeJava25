public class Book {                  // Klassen Book
    private String title;
    private String author;
    private double price;


    public Book (String title, String author, double price) {    // Konstruktor för Book
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayInfo() {         // Metod
        System.out.println("Titel: " + this.title);
        System.out.println("Författare: " + this.author);
        System.out.println("Pris: " + this.price + " kr");
    }

}





