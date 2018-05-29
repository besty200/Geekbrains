/**
 * Java 1. Hometask 4.
 * @author Anton Lipin
 * @version created on 16.05.2018
 */

import java.util.Random;
import java.util.Scanner;

public class Hometask4 {
    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 5;
    public static final char DOT_EMPTY = '�';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("������� �������");
                break;
            }
            if (isMapFull()) {
                System.out.println("�����");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("������� ������������ ���������");
                break;
            }
            if (isMapFull()) {
                System.out.println("�����");
                break;
            }
        }
        System.out.println("���� ���������");
    }

    public static boolean checkWin(char symb) {
        boolean s = false;
        for (int i = 0; i < SIZE; i++) {
            int k = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb)
                    k++;
            }
            if (k == SIZE)
                s = true;
        }

        for (int i = 0; i < SIZE; i++) {
            int k = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == symb)
                    k++;
            }
            if (k == SIZE)
                s = true;
        }

        int k = 0;
        int t = 0;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb && i == j)
                    k++;
                if (map[i][j] == symb && i + j == SIZE - 1)
                    t++;
            }
        }
        if (k == SIZE)
            s = true;
        if (t == SIZE)
            s = true;
        return s;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("��������� ������� � �����" + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("������� ���������� � ������� X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}