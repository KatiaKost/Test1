import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите a: ");
        double a = input.nextDouble();

        double z1 = ((Math.sin(2 * a)) + (Math.sin(5 * a)) - (Math.sin(3 * a))) / ((Math.cos(a)) + 1 - 2 * (Math.pow(Math.sin(2 * a), 2)));
        double z2 = 2 * Math.sin(a);

        System.out.println("z1 = " + z1);
        System.out.println("z2 = " + z2);
    }
}