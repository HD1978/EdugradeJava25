public class Main {

    public static void main(String[] args) {

        System.out.println();
        int a = 7;
        int b = 4;
        System.out.println("Dessa två tal " + a + ", " + b + " körs med enkla matematiska operationer nedan:");
        System.out.println();

        int resAdd = MathOperations.add(a, b);
        System.out.println("Addition: " +resAdd);

        int resSub = MathOperations.subtract(a, b);
        System.out.println("Subtraktion: " + resSub);

        int resMult = MathOperations.multiply(a, b);
        System.out.println("Multiplikation: " + resMult);

        double resDiv = MathOperations.divide(a, b);
        System.out.println("Division: " + resDiv);

    }
}
