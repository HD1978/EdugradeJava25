import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(2);
        numbers.add(43);
        numbers.add(71);
        numbers.add(35);
        numbers.add(99);
        numbers.add(1);

        // Hitta max värdet
        int max = numbers.get(0);
        for (int number :numbers) {
            if (number > max) {
                max = number;
            }
        }

        // Hitta min värdet
        int min = numbers.get(0);
        for (int number :numbers) {
            if (number < min) {
                min = number;
            }
        }

        System.out.println("Största värdet = " + max);
        System.out.println("Minsta värdet = " + min);

    }
}