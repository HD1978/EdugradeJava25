import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Arean samt omkretsen skall beräknas. Ange radien hos en cirkel: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        System.out.println("Du angav radien: " + radius);

        double area = Circle.calculateArea(radius);              // Överföra parametern, beräkna, returnerar till area
        double roundArea = Math.round(area * 100.0) / 100.0;     // Avrunda till två decimaler
        System.out.println("Arean är: " + area + ", avrundat till " + roundArea);

        double peri = Circle.calculatePerimeter(radius);        // Överföra parametern, beräkna, returnerar till peri
        double roundPeri = Math.round(peri * 100.0) / 100.0;
        System.out.println("Omkretsen är: " + peri + ", avrundat till " + roundPeri);

    }
}
