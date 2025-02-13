import java.util.Arrays;
import java.util.Scanner;

class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    }

    private void task_1(){

        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите значение y: ");
        double y = scanner.nextDouble();

        double pi = Math.PI;
        double result = pi + Math.pow(3, x) - 4 * x + 3*(16 * y - 2 * Math.pow(y, 2) + 2 * Math.pow(x, 3) + pi);

        System.out.println("Результат выражения: " + result);
    }

    private void task_2(){
        System.out.print("Введите первое основание трапеции: ");
        double a = scanner.nextDouble();

        System.out.print("Введите второе основание трапеции: ");
        double b = scanner.nextDouble();

        System.out.print("Введите высоту трапеции: ");
        double h = scanner.nextDouble();

        double trapezoidArea = ((a + b) / 2) * h;
        System.out.println("Площадь трапеции: " + trapezoidArea);

        scanner.close();
    }
}