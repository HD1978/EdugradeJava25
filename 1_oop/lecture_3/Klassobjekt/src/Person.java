/*
Uppgift 1.1

(Denna fil)
Skapa en klass Person med attributen name, age, och occupation.

(En Main fil som är körbar)
Skapa ett objekt av klassen och tilldela värden till attributen.
Skriv ut informationen om personen.
*/
public class Person {           // Person är en klass
    String name;                // name är en egenskap (eller ett attribut)
    int age;                    // age är en egenskap (eller ett attribut)
    String occupation;          // occupation är en egenskap (eller ett attribut)

    public void introduce() {   // Uppgift 1.2
        System.out.println("Hej, jag heter " + name + " och jag är " + age + " år gammal och jag arbetar som " + occupation + ".");
    }

}