import java.util.Scanner;

public class FunctionValueCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = 9.2;
        double b = 3.5;
        double c = 12.3;
        System.out.print("Введите x: ");
        double x = input.nextDouble();

        double y = Math.pow(((a * (Math.sqrt((4.19 * Math.pow(x, 3)) - c))) -
                (Math.sqrt((b * (Math.log10(x))) + 10))), - 1);

        System.out.println("y = " + y);
    }
}