import java.util.Scanner;

public class Main {
    static double a = 0;
    static double b = 0;

    public static void main(String[] args) {
        a = inputDouble();
        b = inputDouble();

        sum();
        multiply();
        diff();
        divide();
    }

    private static void divide() {
        System.out.println("Divide: " + a / b);
    }

    private static void diff() {
        System.out.println("Diff: " + (a - b));
    }

    private static void multiply() {
        System.out.println("Multiply: " + (a * b));
    }

    private static void sum() {
        System.out.println("Sum: " + (a + b));
    }

    private static double inputDouble() {
        System.out.println("Print number to calculate: ");
        return new Scanner(System.in).nextDouble();
    }
}
