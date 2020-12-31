import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        int a, b, result;
        int sign;

        System.out.println("Введите уравнение: ");
        str = in.nextLine();
        if (str.substring(1, 2).equals("+")) {
            sign = 1;
        } else sign = 2;

        int numberX = str.indexOf("x");
        if (numberX == 0){
            a = Integer.parseInt(str.substring(2,3));
            b = Integer.parseInt(str.substring(4,5));
            if (sign == 1) {
                result = b - a;
            } else result = b + a;
        }
        else if (numberX == 2) {
            a = Integer.parseInt(str.substring(0, 1));
            b = Integer.parseInt(str.substring(4, 5));
            if (sign == 1) {
                result = b - a;
            } else result = a - b;
        }
        else {
            a = Integer.parseInt(str.substring(0, 1));
            b = Integer.parseInt(str.substring(2, 3));
            if (sign == 1) {
                result = a + b;
            } else result = a - b;
        }
        System.out.printf("x = " + result);
    }
}


