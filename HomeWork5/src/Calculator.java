import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа: ");

        double number1 = in.nextDouble();
        double number2 = in.nextDouble();

        System.out.println("Выберите действие которое необходимо выполнить: " +
                "\n 1) Сложение " +
                "\n 2) Вычитание " +
                "\n 3) Умножение " +
                "\n 4) Деление ");
        int action = in.nextInt();
        switch (action) {
            case 1 -> {
                double sum = number1 + number2;
                System.out.println("Вы выбрали сложение" +
                        "\n результат: " + number1 + " + " + number2 + " = " + sum);
            }
            case 2 -> {
                double subtraction = number1 - number2;
                System.out.println("Вы выбрали вычитание" +
                        "\n результат: " + number1 + " - " + number2 + " = " + subtraction);
            }
            case 3 -> {
                double multiplication = number1 * number2;
                System.out.println("Вы выбрали умножение" +
                        "\n результат: " + number1 + " * " + number2 + " = " + multiplication);
            }
            case 4 -> {
                if(number2 == 0){
                    System.out.println("Не стоит делить на ноль, это опасно!" +
                            "\n придется начать сначала.");
                    break;
                }
                double division = number1 / number2;
                System.out.println("Вы выбрали деление" +
                        "\n результат: " + number1 + " / " + number2 + " = " + division);
            }
            default -> System.out.println("Такого действия еще не изобрели. Выберите из тех что есть.");
        }
    }
}
