public class Main {
    public static void main(String[] args) {
        Person person = new Person();   // person är ett objekt av klassen Person
        person.name = "Erik";
        person.age = 30;
        person.occupation = "Teacher";

        System.out.println("Namn: " + person.name);
        System.out.println("Ålder: " + person.age);
        System.out.println("Yrke: " + person.occupation);

        person.introduce();     // Anropa metoden introduce för objektet person (Uppgift 1.2)
    }
}