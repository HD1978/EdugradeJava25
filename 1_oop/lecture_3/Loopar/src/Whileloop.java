import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {

        System.out.println("| ------------ |");
        System.out.println("| WHILE-LOOPAR |");
        System.out.println("| ------------ |");
        System.out.println();

        System.out.println("Uppgift 2.1");
        System.out.println("Skriv ett program med en while-loop som skriver ut alla JÄMNA tal mellan 1 och 20");
        int index1 = 0;
        while (index1 < 21) {
            System.out.println(index1);
            index1 += 2;          // samma som index1 = index1 + 2
        }

        System.out.println();

        System.out.println("Uppgift 2.2");
        System.out.println("Beskrivning:");
        System.out.println("Skapa ett program med en while-loop som genererar ett tal mellan 1 och 100.");
        System.out.println("Användaren får gissa vilket tal det blev och programmet talar om för användaren");
        System.out.println("ifall det gissade talet var för lågt eller för högt tills användaren skriver in ett");
        System.out.println("korrekt svar. Programmet resgistrerar även hur många försök det blev.");

        System.out.println();

            /*
            Lösning:
            Generera ett slumpmässigt tal mellan 1 och 100
            Använd Scanner för att be användaren slå in ett tal mellan 1 och 100, kontrollera talet
            Jämför det inmatade talet med det genererade talet
            Programmet ger användaren ledtråd ifall det gissade talet var för lågt eller för högt
            Så länge det gissade talet inte är korrekt får användaren göra nya försök
            Programmet registrerar hur många försök användaren fick göra för att få korrekt svar
           */
            /*
            Math.random genererar double typ nummer slumpartat mellan 0 och < 1
            (int) (Math.random() ger alltid 0 (noll)
            Dvs (int) 0.99999999999 ger alltid 0 (noll)
            Multiplicera med 100 blir (int) 99.9999999999 -> 99
            Med Math.ceil metoden avrundas talet uppåt till närmaste heltalet
            99.9999 -> 100
            (int) Math.ceil(Math.random() * 100)
            Även 0.000000000001 resulterar i 1
            */

        int maxFactor = 100;
        int randomNum = (int) Math.ceil(Math.random() * maxFactor);     // Det genererade talet
        // System.out.println("Det genererade talet var: " + randomNum); // Obs! Enbart för verifiering

        System.out.println("--------------------------------------------------------------------");

        Scanner scan = new Scanner(System.in);
        System.out.println("Datorn har genererat ett heltal mellan 1 och 100. Vilket tal blev det?");
        System.out.print("Gissa talet och tryck på ENTER: ");

        int yourNumber = scan.nextInt();  // Inmatning från användaren
        int howmanyGuess = 1;              // Användaren har gissat en gång

        while (yourNumber != randomNum) {
           if (yourNumber < 1 || yourNumber > maxFactor) {
               System.out.println();
               System.out.println("Felaktigt tal, prova igen!");
               System.out.println("Du har gjort " + howmanyGuess + " försök.");
               System.out.println();
               System.out.print("Gissa talet och tryck på ENTER: ");
               yourNumber = scan.nextInt();
               howmanyGuess++;
           }
            else if (yourNumber > randomNum && yourNumber <= maxFactor) {
                System.out.println();
                System.out.println("Talet " + yourNumber + " är för stort, gissa igen: ");
                System.out.println("Du har gjort " + howmanyGuess + " försök.");
                System.out.println();
                System.out.print("Gissa talet och tryck på ENTER: ");
                yourNumber = scan.nextInt();
                howmanyGuess++;
            }
            else if (yourNumber < randomNum && yourNumber >= 1) {
                System.out.println();
                System.out.println("Talet " + yourNumber + " är för litet, prova igen: ");
                System.out.println("Du har gjort " + howmanyGuess + " försök.");
                System.out.println();
                System.out.print("Gissa talet och tryck på ENTER: ");
                yourNumber = scan.nextInt();
                howmanyGuess++;
            }
        }

        if (yourNumber == randomNum) {
            System.out.println();
            System.out.println("Grattis! Du har gissat rätt. Talet var " + randomNum + ".");
            System.out.println("Du lyckades gisssa rätt efter " + howmanyGuess + " försök.");
        }

        // Stänga av scanner
        scan.close();

    }
}