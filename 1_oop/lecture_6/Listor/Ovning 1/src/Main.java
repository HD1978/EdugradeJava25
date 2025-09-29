import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    List<Integer> numbers = new ArrayList<>();

    numbers.add(10);
    numbers.add(15);
    numbers.add(20);
    numbers.add(25);
    numbers.add(30);

    int sum = 0;
    for (int number :numbers) {
        sum += number;
    }

        System.out.println("sum = " + sum);

    }
}