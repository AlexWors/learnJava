import java.util.Scanner;

public class MainArray {
    public static void main(String[] args) {
        int x = 1;
        int y = 5;
        int z = 10;

        System.out.println("Введите размер массива: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] array = new int[size];

        for(int i = 0; i < array.length; i++){
            System.out.println("Введите в массив [" + i + "] элемент: ");
            array[i] = in.nextInt();

            if(array[i] == x || array[i] == y || array[i] == z)
                System.out.println("Данное значение имеется в константах");
        }
    }
}
