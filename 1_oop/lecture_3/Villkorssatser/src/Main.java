import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Uppgift 1.1: Jämnt eller udda");

        Scanner sc = new Scanner(System.in);
        System.out.print("Mata in ett positivt tal: ");
        int tal = sc.nextInt();

        if (tal % 2 == 0) {      // Delar med två och rest = 0 (modulus)
            System.out.println("Talet " + tal + " är jämnt.");
        } else {
            System.out.println("Talet " + tal + " är udda.");
        }

        System.out.println();

        System.out.println("Uppgift 1.2: Avgöra åldersgrupper");
        System.out.print("Hur gammal är du? ");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("Du är minderårig.");
        } else if (age >= 65) {
            System.out.println("Du är senior.");
        } else {
            System.out.println("Du är vuxen.");
        }

        System.out.println();

        System.out.println("Uppgift 1.3: Tre olika heltal. Vilket tal är störst?");

        System.out.print("Ange ett tal: ");
        int number1 = sc.nextInt();

        System.out.print("Ange nästa tal: ");
        int number2 = sc.nextInt();

        System.out.print("Ange nästa tal: ");
        int number3 = sc.nextInt();

        System.out.println("Talen:   " + number1 + "   " + number2 + "   " + number3);
        System.out.println();

        try {
            System.out.println("Tryck ENTER för att fortsätta...");
            System.in.read();
            sc.nextLine();
        } catch (Exception e) {
        }


        if (number1 > number2 && number1 > number3) {
            System.out.println("Talet " + number1 + " är störst.");

        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Talet " + number2 + " är störst");
        } else if (number3 > number1 && number3 > number2) {
            System.out.println("Talet " + number3 + " är störst");
        }

        System.out.println();

        System.out.println("Uppgift 2.3: (Sträng och switch) Vardagsmåltid");
        System.out.println("Vad skall du äta för måltid? Ange frukost, lunch eller middag");
        String meal = sc.nextLine();    // meal är en textsträng för måltiden som förväntas skrivas in
        switch (meal) {
            case "frukost":
                System.out.println("Musli, havredryck och frukt rekommenderas.");
                break;
            case "lunch":
                System.out.println("Grönsakssoppa och bröd rekommenderas.");
                break;
            case "middag":
                System.out.println("Havregrynsgröt, yoghurt och frukt rekommenderas.");
                break;
            default:
                System.out.println("Ogiltig måltid.");
                break;
        }

    }
}