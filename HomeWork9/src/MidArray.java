import java.util.Scanner;

public class MidArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        double[] array = new double[size];
        double num = 0;
        for(int i = 0; i < size; i++) {
            System.out.println("Введите " + (i + 1) + " элемент массива: ");
            array[i] = in.nextDouble();
            num += array[i];
        }
        num /= size;
        System.out.println("Среднее арефмитическое: " + num +
                "\nВыводим массив каждый член которого умножен на среднее арефмитическое: ");
        for(double a : array){
            System.out.println(a * num);
        }
    }
}
