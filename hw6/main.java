package HWJava.hw6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        
        Notebook notebook1 = new Notebook(12, 256, "Windows8", "black");
        Notebook notebook2 = new Notebook(12, 512, "MacOS", "silver");
        Notebook notebook3 = new Notebook(16, 512, "Windows10", "black");
        Notebook notebook4 = new Notebook(16, 1024, "Windows11", "blue");
        Notebook notebook5 = new Notebook(32, 1024, "Windows10", "black");


       

        Set<Notebook> Laptops = new HashSet<>();
        Laptops.add(notebook5);
        Laptops.add(notebook4);
        Laptops.add(notebook3);
        Laptops.add(notebook2);
        Laptops.add(notebook1);

        System.out.println("Добро пожаловать в магазин ноутбуков. Введите необходимые характеристики устройства: ");
        
        Scanner sc = new Scanner(System.in);
        System.out.println(" ОБъем оперативной памяти? 12, 16 или 32 ГБ");
        int userRam = sc.nextInt();
        System.out.println(" ОБъем жесткого диска? 256, 512 или 1024 ГБ");
        int userRom = sc.nextInt();
        System.out.println(" Операционная система? Windows8, Windows10, Windows11  или MacOS");
        String userOS = sc.next();
        System.out.println(" цвет: black, blue, silver");
        String userColor = sc.next();

        for (Notebook elem : Laptops) {
        if((elem.getRam() == userRam) && (elem.getRom() == userRom)
                && (elem.getOs().equals(userOS))
                && (elem.getColor().equals(userColor))){
                System.out.println(elem.toString());

            }
            else {System.out.println("Такого варианта в нашем магазине не найдено, ознакомьтесь с представленными моделями:");
            System.out.println(elem.toString());
           }
           sc.close();
            
        }





    }
    
}
