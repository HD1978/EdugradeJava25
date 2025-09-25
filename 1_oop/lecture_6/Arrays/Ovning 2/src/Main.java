public class Main {
    public static void main(String[] args) {

        int[] numbers = {9, 0, 15, -7, 40, 8, 42, 10};

        // hitta största värdet
        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        System.out.println("Det största värdet är: " + maxValue);

        // hitta det minsta värdet
        int minValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        System.out.println("Det minsta värdet är: " + minValue);

    }
}