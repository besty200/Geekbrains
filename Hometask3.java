import java.util.Random;
import java.util.Scanner;

/**
 * Java 1. Hometask 3.
 * @author Anton Lipin
 * @version created on 15.05.2018
 */
public class Hometask3 {
    private static boolean isGameAvailable = true;

    public static void main(String[] args) {
        // gameCircle();
        game2();
    }

    private static void game() {
        System.out.println("Программа загадывает случайное число от 0 до 9");
        Random rand = new Random();
        int x = rand.nextInt(10);
        System.out.println("Введите ваше число:");
        int k = 1;
        int ost = 2;
        int pr = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            int num = scanner.nextInt();
            ost = 3 - k;
            if (num < x) {
                System.out.println("Ваше число меньше загаданного");
                System.out.println("Количество оставшихся попыток = " + ost);
            } else if (num > x) {
                System.out.println("Ваше число больше загаданного");
                System.out.println("Количество оставшихся попыток = " + ost);
            } else {
                System.out.println("Вы угадали");
                pr = 1;
                break;
            }
            k = k + 1;

        } while (k <= 3);
        if (ost == 0 && pr == 0)
            System.out.println("Вы проиграли!");
        if (pr == 1)
            System.out.println("Победа!");
    }

    private static void gameCircle() {
        while (isGameAvailable) {
            game();
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            Scanner scan = new Scanner(System.in);
            int otvet = scan.nextInt();
            if (otvet == 0) {
                isGameAvailable = false;
                System.out.println("Игра окончена!");
            } else if (otvet == 1)
                isGameAvailable = true;
        }
    }

    private static void game2() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("Компьютер загадывает слово из массива");
        Random rand = new Random();
        int x = rand.nextInt(25);
        String slovo = words[x];
        System.out.println(slovo);
        System.out.println("Введите ваш вариант");
        Scanner scan = new Scanner(System.in);
        boolean isNotRight = true;
        String str = "";
        String test = "###############";
        while (isNotRight) {
            String vashe_slovo = scan.nextLine().toLowerCase();
            if (vashe_slovo.equals(slovo)) {
                System.out.println("Совпало");
                isNotRight = false;
            } else {
                if (vashe_slovo.length() <= slovo.length()) {
                    str = sravSlov(vashe_slovo, slovo);
                } else {
                    vashe_slovo = vashe_slovo.substring(0, slovo.length());
                    str = sravSlov(vashe_slovo, slovo);
                }

                if (vashe_slovo.length() < test.length()) {
                    str = str + test.substring(0, test.length() - vashe_slovo.length());
                }
            }
            System.out.println(str);
            str = "";
            System.out.println("Не совпало");
        }
    }

    private static String sravSlov(String vs, String s) {
        String str = "";
        for (int i = 0; i < vs.length(); i++) {
            if (vs.charAt(i) == s.charAt(i)) {
                str = str + vs.charAt(i);
            } else {
                str = str + "#";
            }
        }
        return str;
    }

}
