import java.util.Scanner;

public class Expeller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        String[] words = str.split("");
        int count = 0;
        for (String word : words) {
            int i = 0;
            boolean a = true;
            while (i < word.length()) {
                if ((word.charAt(i) >= 'a' && word.charAt(i) <= 'z') ||
                        (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')) {
                    i++;
                } else {
                    a = false;
                    break;
                }
            }
            if (a){
                System.out.println(word);
                count++;
            }
        }
        System.out.println(count);
    }
}
