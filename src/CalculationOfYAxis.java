import java.util.Scanner;

public class CalculationOfYAxis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double y;
        System.out.print("Введите х: ");
        double x = input.nextDouble();
        System.out.print("Введите Радиус: ");
        double r = input.nextDouble();

        if (x >= -9 && x < -5) {
            y = -Math.sqrt(Math.pow(r, 2) - Math.pow((x + 7), 2)) + r;
            System.out.println("y = " + y);
        } else if (x >= -5 && x < -4) {
            y = 2;
            System.out.println("y = " + y);
        } else if (x >= -4 && x < 0) {
            y = -(1.0 / 2) * x;
            System.out.println("y = " + y);
        } else if (x >= 0 && x < Math.PI) {
            y = (-1.0 / 2) * Math.pow(x - ((Math.PI) / 2), 2) + 1;
            System.out.println("y = " + y);
        } else if (x >= Math.PI && x < 5) {
            y = x - Math.PI;
            System.out.println("y = " + y);
        } else System.out.println("у не определен");
    }
}