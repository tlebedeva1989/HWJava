package HWJava.hw3;

import java.util.ArrayList;
import java.util.Random;

// Пусть дан произвольный список целых чисел, удалить из него четные числа
public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        Random random = new Random();
        for (int index = 0; index < 20; index++) {
            list.add(random.nextInt(20));
            System.out.print(list.get(index) + " ");
        
            }
        for (int index = 0; index < list.size(); index++) {
            if (list.get(index) % 2 == 0){
                list.remove(index);
                index--;
            }
            
        }  
        System.out.println();
        for (int index = 0; index < list.size(); index++) {
            System.out.print(list.get(index) + " "); 
        }
         

    }
}
