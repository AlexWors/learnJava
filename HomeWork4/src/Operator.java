import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите три числа: ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        double average = (x + y + z) / 3;
        double halfAverage = average / 2;

        String result = Math.floor(halfAverage) > 3 ? "Программа выполнена корректно" : "Ошибочка!";
        System.out.println(result);
    }
}