import java.util.Scanner;

// Реализовать простой калькулятор (+ - / *)

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a first number: ");
        int firstNum = sc.nextInt();
        
        System.out.println("Input a second number: ");
        int secNum = sc.nextInt();

        System.out.println("Input an math action: ");
        String act = sc.nextLine();

        
        sc.close();

    System.out.print("result = ");

      
        switch(act){
            case "+":
            System.out.print(firstNum+secNum);
            break;

            case "-":
            System.out.print(firstNum-secNum);
            break;

            case "*":
            System.out.print(firstNum*secNum);
            break;

            case "/":
            System.out.print(firstNum/secNum);
            break;

            default:
            System.out.println("Некорректное действие");


        }

            
        

    }
    
}
