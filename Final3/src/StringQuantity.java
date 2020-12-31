import java.util.Scanner;

public class StringQuantity {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Количество строк: ");
            int countStrings = scanner.nextInt();
            String[] arrayString = new String[countStrings];
            int i = 1;
            while (i <= countStrings) {
                System.out.println("Строка " + i + ": ");
                arrayString[i - 1] = scanner.next();
                i++;
            }
            int countMax = 0;
            int numMax = 0;
            for (int k = 0; k < arrayString.length; k++) {
                char[] arrayChars = arrayString[k].toCharArray();
                i = 0;
                while (i < arrayChars.length){
                    for (int j = i + 1; j < arrayChars.length; j++) {
                        if (arrayChars[i] == arrayChars[j]) {
                            arrayChars[j] = '\u0000';
                            break;
                        }
                    }
                    i++;
                }
                int count = 0;
                for (char arrayChar : arrayChars) {
                    if (arrayChar != '\u0000') {
                        count++;
                    }
                }
                if (count > countMax) {
                    countMax = count;
                    numMax = k;
                }
            }
            System.out.print("Ответ: " + arrayString[numMax]);
        }
    }
