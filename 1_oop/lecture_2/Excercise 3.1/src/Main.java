import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Skapa nytt scanner class objekt
        Scanner scan = new Scanner(System.in);

        System.out.print("Ange längden på första katet (mm): ");
        int kat1 = scan.nextInt();

        System.out.print("Ange längden på andra katet: (mm): ");
        int kat2 = scan.nextInt();

        System.out.println("Längden på hypotenusan (mm): " +Math.sqrt(kat1 * kat1 + kat2 * kat2));

        // Stänga av scanner
        scan.close();

    }
}