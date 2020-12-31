import java.util.Scanner;

public class ConverVal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double dollar;
        double rubles;
        System.out.print("Введите текущий курс доллара к рублю: ");
        dollar = in.nextDouble();
        System.out.print("Введите количество рублей: ");
        rubles = in.nextDouble();
        System.out.printf("итого: " + Math.floor((rubles/dollar)) + " долларов");
    }
}
