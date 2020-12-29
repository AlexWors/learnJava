import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк матрицы: ");
        int a = in.nextInt();
        System.out.println("Введите количество столбцов матрицы: ");
        int b = in.nextInt();
        double[][] array = new double[a][b];
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                System.out.println("Введите число " + i + " строки " + j + " столбца: ");
                array[i][j] = in.nextDouble();
            }
        }
        for(var k = 0; k < b; k++){
            System.out.println(array[0][k] * 3);
        }
    }
}
