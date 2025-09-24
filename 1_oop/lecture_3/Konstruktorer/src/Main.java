public class Main {
    public static void main(String[] args) {
        // Uppgift 2.1
        Person person = new Person("Anna", 25, "Engineer");

        // Uppgift 2.2
        Person defaultPerson = new Person();        // Ett objekt defaultPerson skapas
        System.out.println("Namn: " + defaultPerson.name);
        System.out.println("Ålder: " + defaultPerson.age);
        System.out.println("Yrke: " + defaultPerson.occupation);
    }
}