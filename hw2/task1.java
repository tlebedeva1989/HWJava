// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), результат после каждой итерации запишите в лог-файл.

package HWJava.hw2;

import java.io.FileWriter;
import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        
        int[] array = {5, 8, 2, 4, 1, 3, 7, 6};
        int count = 0;
        int temp = 0;
        String file_name = "log_sort.txt";
        while (count < array.length -1) {
            for (int index = 1; index < array.length; index++) {
                if (array[index-1] > array[index]){
                    temp = array[index];
                    array[index] = array[index-1];
                    array[index-1] = temp;

                
                }
           
            
            }
            count ++;
            try {
                FileWriter writer = new FileWriter(file_name, true);
                String res = Arrays.toString(array);
                writer.write(res);
                writer.write("\n");
                writer.close();
            }
                  catch (Exception e) {
                System.out.println("что то пошло не так!");
            }
        }

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
       
    }
    
}
