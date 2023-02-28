//  Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

package HWJava.hw2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println(" Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(palindrom(input));
        sc.close();

    }

    private static boolean palindrom(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) return false;
        }
        return true;
        
    }
    
}
