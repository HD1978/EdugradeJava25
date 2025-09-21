import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("| ---------- |");
        System.out.println("| FOR-LOOPAR |");
        System.out.println("| ---------- |");
        System.out.println();

            System.out.println("Uppgift 1.1");
            System.out.println("Skriv ut alla heltal från 1 till 10 med en for-loop");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                }

            System.out.println();
            System.out.println("Uppgift 1.2");
            System.out.println("Skriv ett program som använder en for-loop för att " +
                    "beräkna och skriva ut summan av alla tal från 1 till 100");

                int summa = 0;
                for (int i = 1; i <= 100; i++) {
                    summa += i;          // samma sak som summa = summa + i;
                }
                System.out.println("Summan av 1 till 100 är: " + summa);

            System.out.println();

            System.out.println("Uppgift 1.3");
            System.out.println("Skriv ett program som använder en for-loop för att " +
                    "skriva ut en multiplikationstabell för ett tal som användaren matar in");

            System.out.println();

                // Skapa nytt scanner class objekt
                Scanner scan = new Scanner(System.in);
                System.out.print("Ange ett tal (mellan 1 och 10) för en multiplikationstabell och tryck på ENTER ");

                int tal = scan.nextInt();   // Läs in från användaren

                    if (tal < 1 || tal > 10) {              // Kontrollera talet
                        System.out.println("Felaktigt tal!");
                    }
                    else {
                        System.out.println("Multiplikationstabellen för talet "+tal +":");
                        int prod;
                        for (int i = 1; i <= 10; i++) {
                            prod = tal * i;
                            System.out.println(tal +" x " +i +" = " +prod);
                        }
                    }
    }
}