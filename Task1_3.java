/* Реализовать простой калькулятор */

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int a = scan.nextInt();
        System.out.printf("Выберите действие \n 1:  + \n 2:  -\n 3:  *\n 4:  /\n введите цифру(1-4): ");              //( + , - , * или /): ");
        int sign = scan.nextInt();
        System.out.printf("Введите второе число: ");
        int b = scan.nextInt();

        switch (sign) {
            case 1:
                System.out.printf("%d + %d = %d\n", a, b, addition(a, b));
                break;
            case 2:
                System.out.printf("%d - %d = %d\n", a, b, subtraction(a, b));
                break;
            case 3:
                System.out.printf("%d * %d = %d\n", a, b, multiplication(a, b));
                break;
            case 4:
                System.out.printf("%d : %d = %.2f\n", a, b, division(a, b));
                break;
            default:
                System.out.println("Вы ввели некорректное действие!");
                break;
        }
        scan.close();    
    }

    public static int addition(int x, int y) {
        return x + y;
    }
    public static int subtraction(int x, int y) {
        return x - y;
    }
    public static int multiplication(int x, int y) {
        return x * y;
    }
    public static double division(int x, int y) {
        return (double)x / y;
    }
}
