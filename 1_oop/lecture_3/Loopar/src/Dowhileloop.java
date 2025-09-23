import java.util.Scanner;

public class Dowhileloop {
    public static void main(String[] args) {

        System.out.println("| --------------- |");
        System.out.println("| DO-WHILE-LOOPAR |");
        System.out.println("| --------------- |");
        System.out.println();

        System.out.println("Uppgift 3.1");
        System.out.println("Skriv ett program som använder en do-while loop för att upprepat fråga " +
                "användaren tills man matar in ett negativt tal");

        System.out.println();

        Scanner scan = new Scanner(System.in);

        int number;
        do {
            System.out.println("Programmet avslutas om du matar in ett negativt tal.");
            System.out.println("Mata in ett tal: ");
            number = scan.nextInt();

            System.out.println();

            System.out.println("Du matade in talet " + number + ".");
        } while (number >= 0);

        /*
        3.1 avslutas här dvs 3.2 startas inte förrän 3.1 avslutas.
        Båda program skrivs medvetet ihop som ett program i detta fall
        */

        System.out.println();

        System.out.println("Uppgift 3.2");
        System.out.println("Skriv ett program som använder en do-while loop för att skriva ut en meny");
        System.out.println("för en enkel kalkylator och be användaren välja en operation");
        System.out.println("tills man väljer 0 för att avsluta.");

        System.out.println();

        Scanner scn = new Scanner(System.in);

        int choice;

        do {
            System.out.println("Välj en operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraktion");
            System.out.println("3. Multiplikation");
            System.out.println("4. Division");
            System.out.println("0. Avsluta");

            System.out.println();
            choice = scn.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Addition vald.");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Subtraktion vald.");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Multiplikation vald.");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Division vald.");
                    System.out.println();
                    break;
            }
        } while (choice != 0);

        System.out.println("Programmet avslutat.");

    }
}
