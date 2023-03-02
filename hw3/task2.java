// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка
package HWJava.hw3;

import java.util.ArrayList;

import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        Random random = new Random();
        for (int index = 0; index < 10; index++) {
            list.add(random.nextInt(20));
            System.out.print(list.get(index) + " ");
        }
        int max = list.get(0);
        int min = list.get(0);
        int sum = 0;
        int aver = 0;
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max){
                max = list.get(i);
                            }
            else if (list.get(i) < min) {
                min = list.get(i);
                
            }             
            sum  = sum + list.get(i) ;
        }

        aver = sum / list.size();

        

    System.out.println();
    System.out.print("min = " + min + " max = " + max + " average = " + aver);

}
}
