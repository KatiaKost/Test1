import java.util.Scanner;

public class GravitationalConstant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите m1: ");
        double m1 = input.nextDouble();
        System.out.print("Введите m2: ");
        double m2 = input.nextDouble();
        System.out.print("Введите r: ");
        double r = input.nextDouble();
        final double G = 6.674 * Math.pow(10, -11);

        double force = (G * m1 * m2) / (Math.pow(r, 2));
        // в формуле были не расставлены скобки, т.е действия выполнялись поочередно

        System.out.println("F = " + force);
    }
}