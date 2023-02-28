// //  Дана строка (получение через обычный текстовый файл!!!)

// "фамилия" 0:"Иванов" 1,"оценка" 2:"5" 3 ,"предмет" 4 :"Математика" 5
// "фамилия" 6 :"Петрова"7 ,"оценка" 8:"4" 9 ,"предмет"10 :"Информатика" 11

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.


package HWJava.hw2;

import java.io.File;
import java.io.FileReader;

public class task2 {
    public static void main(String[] args) {
        String file_name = "text.txt";
        File file = new File(file_name);
        String[] res = parsString(file);
        formatOutput(res);


    }


    public static void formatOutput(String[] strings) {
        String[] formatText = {"Студент", "получил", "по предмету"};
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (count < strings.length/5){
            for (int index = 1; index < strings.length; index+=2) {
                
                for (int j = 0; j < formatText.length; j++) {
                    sb.append(formatText[j]+ " ").append(strings[index]+" ");
                    
                    count++;
                    
                }
            
        }
        String res = sb.toString();
        System.out.println(res);
    }
        
    }

    public static String[] parsString(File file) {
        String[] textAr = null;
        try {
            StringBuilder sb = new StringBuilder();
            FileReader f = new FileReader(file);
            char[] a = new char[(int) file.length()];
            f.read(a);
            for(char c:a){
                // System.out.print(c);
                sb.append(c);
            }
            f.close();
            
            String text = sb.toString();
            text = text.replace("\"", "");
            text = text.replace(":", ",");
            textAr = text.split(",");
                                  
                                           
            
            // System.out.println(textAr);
            // sb.replace(0, 9, "студент");
            // System.err.println(sb);

        }
        catch (Exception e) {
            System.out.println("что то пошло не так");

        }
        return textAr;
    }
    
}
