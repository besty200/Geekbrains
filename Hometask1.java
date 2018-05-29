import java.util.Scanner;

/**
 * Java 1. Hometask 1.
 * Created by lipin on 07.05.2018.
 *
 * @author Anton Lipin
 */
public class Hometask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte a = 127;
        short b = -3333;
        int c = 647367497;
        long d = 964792349844554646L;
        float e = 8675066767347340.348666344f;
        double f = 744663464366565656477666.455355555555465366;
        boolean g = true;
        char h = 'A';
         int year = scanner.nextInt();
        //  String name = scanner.nextLine();
        //  int number = scanner.nextInt();
        //System.out.println(privet(name));
        //System.out.println(yearLeap(year));
        //System.out.println(isNegative(number));
        //System.out.println(typeNumber(number));
       // System.out.println(virazhenie(2,4,6,7));
         //System.out.println(predel(10,10));

    }

    // 3-е задание
    private static double virazhenie(double a, double b, double c, double d) {
        return (a * (b + (c / d)));
    }

    // 4-е задание
    private static boolean predel(int a, int b) {
        return (a + b > 10 && a + b <= 20);
    }

    // 5-е задание
    private static String typeNumber(int number) {
        return ((number < 0) ? "число отрицательное" : "число положительное");
    }

    // 6-е задание
    private static boolean isNegative(int number) {
        boolean s=true;
        if (number >= 0)
            s=false;
        return s;
    }

    // 7-е задание
    private static String privet(String name) {
        String s="";
        s="Привет, " + name + "!";
        return s;
    }

    // 8-е задание
    private static String yearLeap(int year) {
        String s="";
        String s1="Год високосный";
        String s2 = "Год невисокосный";
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                s=s1;
                //System.out.println("Год високосный");
            } else if (year % 100 == 0 && year % 400 != 0)
                s=s2;
                //System.out.println("Год невисокосный");
            else if (year % 100 == 0 && year % 400 == 0)
                s=s1;
            //System.out.println("Год високосный");
        } else
            s=s2;
        //System.out.println("Год невисокосный");
        return s;
    }

}





