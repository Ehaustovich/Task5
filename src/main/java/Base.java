
import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите операцию: 1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление");
        int i = scanner.nextInt();
        System.out.println("Введите 1 число");
        double m = scanner.nextDouble();
        System.out.println("Введите 2 число");
        double n = scanner.nextDouble();
        Calculator calculator = new Calculator(m, n, i);
        calculator.getResult();
        scanner.close();
    }
}
