import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = in.nextInt();
        int sum = 0;

        for (int i = 0; i < num; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }
        System.out.println("Сумма всех нечетных чисел: " + sum);
    }
}
