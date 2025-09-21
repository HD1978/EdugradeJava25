import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Skapa nytt scanner class objekt
        Scanner scan = new Scanner(System.in);

        System.out.print("Ange din ålder och tryck ENTER: ");
        int age = scan.nextInt();

        boolean canVote = (age >= 18);
        boolean canRetire = (age >= 65);

        System.out.println("Du kan rösta: "+canVote);
        System.out.println("Du kan gå i pension: "+canRetire);

        // Stänga av scanner
        scan.close();

    }
}