import java.util.Scanner;

public class LikeJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "I like Java!!!";
        if(str.contains("Java") && str.startsWith("I like") && str.endsWith("!!!")){
            System.out.println(str.toUpperCase());
        }
        System.out.println(str.replace('a', 'o').substring(7, 11));
    }
}
