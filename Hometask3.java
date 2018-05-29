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
        System.out.println("��������� ���������� ��������� ����� �� 0 �� 9");
        Random rand = new Random();
        int x = rand.nextInt(10);
        System.out.println("������� ���� �����:");
        int k = 1;
        int ost = 2;
        int pr = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            int num = scanner.nextInt();
            ost = 3 - k;
            if (num < x) {
                System.out.println("���� ����� ������ �����������");
                System.out.println("���������� ���������� ������� = " + ost);
            } else if (num > x) {
                System.out.println("���� ����� ������ �����������");
                System.out.println("���������� ���������� ������� = " + ost);
            } else {
                System.out.println("�� �������");
                pr = 1;
                break;
            }
            k = k + 1;

        } while (k <= 3);
        if (ost == 0 && pr == 0)
            System.out.println("�� ���������!");
        if (pr == 1)
            System.out.println("������!");
    }

    private static void gameCircle() {
        while (isGameAvailable) {
            game();
            System.out.println("��������� ���� ��� ���? 1 � �� / 0 � ���");
            Scanner scan = new Scanner(System.in);
            int otvet = scan.nextInt();
            if (otvet == 0) {
                isGameAvailable = false;
                System.out.println("���� ��������!");
            } else if (otvet == 1)
                isGameAvailable = true;
        }
    }

    private static void game2() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("��������� ���������� ����� �� �������");
        Random rand = new Random();
        int x = rand.nextInt(25);
        String slovo = words[x];
        System.out.println(slovo);
        System.out.println("������� ��� �������");
        Scanner scan = new Scanner(System.in);
        boolean isNotRight = true;
        String str = "";
        String test = "###############";
        while (isNotRight) {
            String vashe_slovo = scan.nextLine().toLowerCase();
            if (vashe_slovo.equals(slovo)) {
                System.out.println("�������");
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
            System.out.println("�� �������");
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
