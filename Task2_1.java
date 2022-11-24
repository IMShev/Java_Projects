/*  Напишите метод, который принимает на вход строку (String)
    и определяет является ли эта строка палиндромом. */

import java.util.Scanner;

public class Task2_1 {
    public static void main(String args[]){
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input string: ");
        String myStr = iScanner.nextLine(); 
        String myString = myStr.replace(" ", "");    // убираем пробелы, если они есть 

        StringBuilder build = new StringBuilder(myString); 
        build.reverse();
        String data = build.toString();

        boolean a = myString.equalsIgnoreCase(data);    // не учитываем регистр
        System.out.println(a);
        
        if(myString.equalsIgnoreCase(data)){
            System.out.println("This string is a palindrome.");
        }else{
            System.out.println("This string is not a palindrome.");
        }

        iScanner.close();
    }
}

