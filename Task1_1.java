/* Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n) */

import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input integer N: ");
        while (!iScanner.hasNextInt()) {
            System.err.println("Error! Input integer N: ");
            iScanner.next();
        }
        int num = iScanner.nextInt();

        System.out.printf("Sum from 1 to N = %d\n", triangle_number(num));
        System.out.printf("Product from 1 to N = %d\n", factorial(num));

        iScanner.close();
    }

    public static int triangle_number(int n) {
        return n * (n + 1) / 2;
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
