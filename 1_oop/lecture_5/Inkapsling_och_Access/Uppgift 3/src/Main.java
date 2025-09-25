public class Main
{
    public static void main(String[] args)
    {
        EBook ebook = new EBook();
        ebook.setTitle("Java Book");
        ebook.setAuthor("John Doe");
        ebook.setPublicationYear(2018);

        System.out.println("EBook Title: " + ebook.getTitle());
        System.out.println("EBook Author: " + ebook.getAuthor());
        System.out.println("EBook Year Published: " + ebook.getYearPublished());
    }
}