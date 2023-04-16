import java.util.Scanner;

public class FunctionValueCalculationWithCondition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите x: ");
        double x = input.nextDouble();
        double y;

        if (x <= 1) {
            System.out.print("Введите a: ");
            double a = input.nextDouble();

            y = 1 / ((Math.pow(a, 2)) + Math.pow(x, 2));
            System.out.println("y= " + y);

        } else if (x > 1) {

            System.out.print("Введите b: ");
            double b = input.nextDouble();

            y = b * Math.log10(Math.abs(x));
            System.out.println("y= " + y);
        }
    }
}
