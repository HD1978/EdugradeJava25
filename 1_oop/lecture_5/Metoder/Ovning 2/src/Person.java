/*
- Skapa en klass Person med en metod greet som
tar en sträng name som parameter och skriver ut
en hälsning.
- Lägg till en metod introduce som tar parametrar
för namn, ålder och staden där personen bor, och
skriver ut en information

- Metoderna är i static så att man inte behöver i Main skapa
objekt av klassen Person i detta fall, utan kan kalla det direkt med hjälp
av Person.metod();
 */

public class Person {

    public static void greet(String name)
    {
        System.out.println("Hello " + name + "!");
    }

    public static void introduce(String name, int age, String city)
    {
        System.out.println("My name is " + name + ", and I am " + age + " years old and I live in " + city + ".");
    }
}
