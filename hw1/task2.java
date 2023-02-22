// Вывести все простые числа от 1 до 1000

public class task2 {
    public static void main(String[] args) {
       for (int index = 1; index < 1001; index++) {
            if (isPrime(index))
            System.out.print(index + " ");
        
       } 
        
    }
   
    
    public static boolean isPrime(int n) {
        
        for (int index = 2; index < n / 2 + 1; index++) 
            if (n % index == 0) return false;
        return true;
           
           
    }
}
