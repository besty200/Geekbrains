/**
 * Created by lipin on 11.05.2018.
 */
public class Hometask2 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        minMax();
        System.out.println(checkBalance());
    }


    private static void invertArray() {
        String s = "";
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i] + " ";
        }
        System.out.println(s);
    }

    private static void fillArray() {
        int[] arr = new int[8];
        String s = "";
        arr[0] = 0;
        for (int i = 1; i < arr.length; i++) {

            arr[i] = i * 3;
        }

        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i] + " ";
        }
        System.out.println(s);
    }

    private static void changeArray() {
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        String s = "";
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) {
                w[i] *= 2;
            }
        }
        for (int i = 0; i < w.length; i++) {
            s = s + w[i] + " ";
        }
        System.out.println(s);
    }

    private static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            arr[i][i] = 1;
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    private static void minMax() {
        int[] arr = {1, 5, 3, 2, 11, 4, 0, -5, 5, 2, 4, 12, 8, 9, 1};
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Минимальное элемент = " + min);
        System.out.println("Максимальное элемент = " + max);
    }

    private static String checkBalance() {
        String s = "false";
        int[] arr = {1, 1, 1, 2, 1};
        int sum_left = 0;
        int sum_right = 0;

        for (int i = 0; i < arr.length; i++) {
            sum_left = 0;
            sum_right = 0;

            for (int j = 0; j < i; j++) {
                sum_left = sum_left + arr[j];
            }

            for (int j = i; j < arr.length; j++) {
                sum_right = sum_right + arr[j];
            }

            if (sum_left == sum_right) {
                s = "true";
            }
        }
        return s;
    }

}
