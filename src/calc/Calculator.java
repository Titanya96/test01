package calc;

import java.util.Scanner;

/*
калькулятор принимает на вход поочередно:
1- целое число
2- знак математического действия (сложение, вычитание, деление, умножение)
3- целое число
Затем проводит действия между числами на основе заданного действия
Учесть деление на 0, отдать ошибку (если смогёшь, то exception, гугль попробуй спросить (: )
Желательно отдельно написать методы для каждой операции, а не в одном методе ( если разберешься)
getCalcResult() - должен отдавать на выход строку в формате Result = 4.
*если в одном из входных параметров передано "exit" - то программа должна выйти. (System.exit(0))
 */
public class Calculator {

    public static void main(String[] args) {
        getCalcResult();
    }

    private static void getCalcResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Первое целое число: ");
        String a = scanner.nextLine();
        if (a.equals("exit")) {
            exitCalc();
        }
        System.out.println("Вы ввели: " + a + "\nВведите операцию: ");
        String act = scanner.next();
        System.out.println("Второе целое число: ");
        int b = scanner.nextInt();
        System.out.println("Вы ввели: " + b + "\nРезультат = " + result(Integer.parseInt(a), b, act));
    }

    static String result(int a, int b, String act){
        switch(act) {
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
                try {
                    return String.valueOf(a / b);
                }
                catch (ArithmeticException e) {
                    System.out.println("На ноль делить нельзя!");
                }
                return String.valueOf(a / b);
            default:
                return String.valueOf(0);
        }
    }

    static void exitCalc() {
        System.exit(0);
    }
}

