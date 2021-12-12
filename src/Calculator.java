import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // сканер общий для ввода

        /** TASK 1
         * вывести первую и последнюю буквы строки.
         */
//        char chAny = string.charAt(string.length() - 1);
//        System.out.println(chAny);
        /*
        string "abcdef"
        index:  012345
        length: кол-во элементов
         */
        System.out.println("Введите Вашу фразу: ");
        String string = scanner.nextLine();
        System.out.println(string.charAt(0));
        System.out.println(string.charAt(string.length() - 1));

/**
 *  вывести результаты в виде String, а не int.
 *  не забывать про типы данных, которые отдают методы.
 */

        System.out.println("Первое целое число: ");
        int a = scanner.nextInt();
        System.out.println("Вы ввели: " + a);
        System.out.println("Второе целое число: ");
        int b = scanner.nextInt();
        System.out.println("Вы ввели: " + b);
        System.out.println("Что с ними сделать? ");
        String act = scanner.next();
        System.out.println("Результат = " + result(a, b, act));
    }

    static String result(int a, int b, String act) {
        switch (act) {
            case "+":
                return String.valueOf(a + b);
            case "-":
                return String.valueOf(a - b);
            case "*":
                if (a == 0 || b == 0) {
                    return String.valueOf(0);
                } else {
                    return String.valueOf(a * b);
                }
            case "/":
                if (b == 0) {
                    return byZero(a);
                } else {
                    return String.valueOf(a / b);
                }
            default:
                return String.valueOf(0);
        }
    }

    static String byZero(int a) {
        return String.valueOf(a * a);
    }
}