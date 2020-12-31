import java.util.Scanner;

public class Riddle {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Разгадай загадку: Сидит дед во сто шуб одет, кто его раздевает, то слёзы проливает.");
            System.out.println("Даю три попытки без подсказки или одну попытку, но с подсказкой:) " + "Если хочешь подсказку, дай знать вот так: \"Хочу подсказку\"");
            int i = 1;
            boolean flagAnswer = true;
            boolean flag = false;
            while (i <= 3) {
                System.out.println("Какие идеи? ");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("Заархивированный вирус")) {
                    System.out.println("Правильно!");
                    flagAnswer = false;
                    break;
                }
                else if (input.equalsIgnoreCase("Хочу подсказку")) {
                    if (i == 1) {
                        flag = true;
                        System.out.println("Чаще всего коня одного напоминает");
                    }
                    else {
                        System.out.println("Подсказка уже недоступна");
                        continue;
                    }
                }
                else {
                    if (i == 2 && flag) {
                        break;
                    }
                    else if (i == 1 || i == 2) {
                        System.out.println("Подумай еще!");
                    }
                }
                i++;
            }
            if (flagAnswer) {
                System.out.println("Обидно, приходи в другой раз");
            }
        }
    }
