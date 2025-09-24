/*
Uppgift 2.1
Klassen Person är kopierad från uppgiften 1.1
I denna uppgift skall konstruktor läggas till
*/
public class Person {           // Person är en klass
    String name;                // name är en egenskap (eller ett attribut)
    int age;                    // age är en egenskap (eller ett attribut)
    String occupation;          // occupation är en egenskap (eller ett attribut)

    public Person(String name, int age, String occupation) {    // En konstruktor är skapad i klassen Person
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    /* Uppgift 2.2 Lägg till en konstruktor utan parametrar som tilldelar
    standardvärden till attributen. Skapa ett objekt för denna konstruktor
    och skriv ut standardvärdena
    */
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.occupation = "Unknown";
    }
}
