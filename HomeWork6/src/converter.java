import java.util.Scanner;

public class converter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Выберите что переводить: " +
                "\n 1) Масса" +
                "\n 2) Расстояние");
        int choise = in.nextInt();
        if(choise == 1){
            GetWeight(in);
        }
        else if(choise == 2){
            GetDistance(in);
        }
        else{
            System.out.println("Ошибочка");
        }
    }
    static void GetWeight(Scanner in){
        System.out.println("Выберите единицу измерения:" +
                "\n 1) Тонна" +
                "\n 2) Центнер" +
                "\n 3) Килограмм" +
                "\n 4) Грамм");
        int choise2 = in.nextInt();
        double num = EnterNum(in);
        switch(choise2){
            case 1:
                System.out.println("Результат: " +
                        "\n Тонна: " + num +
                        "\n Центнер: " + num * 10 +
                        "\n Килограмм: " + num * 1000 +
                        "\n Грамм: " + num * 1000000);
                break;
            case 2:
                System.out.println("Результат: " +
                        "\n Центнер: " + num +
                        "\n  Тонна: " + num * 0.1 +
                        "\n Килограмм: " + num * 100 +
                        "\n Грамм: " + num * 100000);
                break;
            case 3:
                System.out.println("Результат: " +
                        "\n Килограмм: " + num +
                        "\n Центнер: " + num * 0.01 +
                        "\n Тонна: " + num * 0.0001 +
                        "\n Грамм: " + num * 1000);
                break;
            case 4:
                System.out.println("Результат: " +
                        "\n Грамм: " + num +
                        "\n Центнер: " + num * 0.0001 +
                        "\n Тонна: " + num * 0.000001 +
                        "\n Килограмм: " + num * 0.001);
                break;
            default:
                System.out.println("Ошибка, брат! Такого здесь нет");
                break;
        }
    }

    static void GetDistance(Scanner in){
        System.out.println("Выберите единицу измерения:" +
                "\n 1) Метр" +
                "\n 2) Миля" +
                "\n 3) Ярд" +
                "\n 4) Фут");
        int choise2 = in.nextInt();
        double num = EnterNum(in);
        switch (choise2){
            case 1:
                System.out.println("Результат: " +
                        "\n Метр: " + num +
                        "\n Миля: " + num * 0.0006 +
                        "\n Ярд: " + num * 1.094 +
                        "\n Фут: " + num * 3.281);
                break;
            case 2:
                System.out.println("Результат: " +
                        "\n Миля: " + num +
                        "\n Метр: " + num * 1609 +
                        "\n Ярд: " + num * 1760 +
                        "\n Фут: " + num * 5280);
                break;
            case 3:
                System.out.println("Результат: " +
                        "\n Ярд: " + num +
                        "\n Миля: " + num * 0.0005682 +
                        "\n Метр: " + num * 0.9144 +
                        "\n Фут: " + num * 3);
                break;
            case 4:
                System.out.println("Результат: " +
                        "\n Фут: " + num +
                        "\n Миля: " + num * 0.0001894 +
                        "\n Метр: " + num * 0.3048 +
                        "\n Ярд: " + num * 0.3333);
                break;
        }
    }

    static double EnterNum(Scanner in){
        System.out.println("Введите число: ");
        return in.nextDouble();
    }
}
