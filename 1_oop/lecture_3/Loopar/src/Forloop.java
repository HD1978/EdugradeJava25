import java.util.Scanner;

public class Forloop {
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

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;          // samma sak som sum = sum + i;
        }
        System.out.println("Summan av 1 till 100 är: " +sum);

        System.out.println();

        System.out.println("Uppgift 1.3");
        System.out.println("Skriv ett program som använder en for-loop för att " +
                "skriva ut en multiplikationstabell för ett tal som användaren matar in");

        System.out.println();

        // Skapa nytt scanner class objekt
        Scanner scan = new Scanner(System.in);
        System.out.print("Ange ett tal (mellan 1 och 10) för en multiplikationstabell och tryck på ENTER: ");

        int numb = scan.nextInt();   // Läs in från användaren

        if (numb < 1 || numb > 10) {              // Kontrollera talet
            System.out.println("Felaktigt tal!");
        }
        else {
            System.out.println("Multiplikationstabellen för talet "+numb +":");
            int prod;
            for (int i = 1; i <= 10; i++) {
                prod = numb * i;
                System.out.println(numb +" x " +i +" = " +prod);
            }
        }

        // Stänga av scanner
        scan.close();
    }
}