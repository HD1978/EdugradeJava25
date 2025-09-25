public class Circle {

    public static double calculateArea(double radius)
    {
        return radius * radius * Math.PI;         // Area = r * r * Pi, returner double till Main
    }

    public static double calculatePerimeter(double radius)
    {
        return 2 * radius * Math.PI;            // Omkretsen = 2 * r * Pi, returnerar double till Main
    }
}
