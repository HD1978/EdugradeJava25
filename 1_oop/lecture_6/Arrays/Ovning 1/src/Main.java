public class Main {
    public static void main(String[] args) {

        int[] numbers;              // deklarera en array
        numbers = new int[5];       // Arrayen kan innehålla 5 heltal
        // Kan också skriva ihop: int[] numbers = new int[5];

        // Tilldela värden
        numbers[0] = 7;
        numbers[1] = 5;
        numbers[2] = 14;
        numbers[3] = 2;
        numbers[4] = 6;

         // Beräkna medelvärdet
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];              // sum = sum + numbers[i]
        }

        // deklarera medelvärdet som double. Konvertera numbers.length med (double) innan division
        double average = sum / (double) numbers.length;
        System.out.println("Medelvärdet = " + average);
    }
}