import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)

public class task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int n = sc.nextInt();
        sc.close();
        int resSum = 0;
        int resMult = 1;
        for (int index = 1; index < n+1; index++) {
            resSum += index;
            resMult *= index;
            
        }

        System.out.print("Треугольное число: ");
        System.out.println(resSum);
        System.out.print("Факториал числа: ");
        System.out.println(resMult);
        
               }
}

