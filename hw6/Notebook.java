// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. минимум 5 NoteBook notebook1 = new NoteBook NoteBook notebook2 = new NoteBook NoteBook notebook3 = new NoteBook NoteBook notebook4 = new NoteBook NoteBook notebook5 = new NoteBook
// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// Далее нужно запросить критерии - сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.

// Класс сделать в отдельном файле

// Пример: ----->

// приветствие

// Выбор параметра:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет
// выбор конкретнее
// 1 ---> Введите колво ---> 16
// вывод всех подходящих ноутбуков по параметру

package HWJava.hw6;

public class Notebook {
    private Integer ram;
    private Integer rom;
    private String os;
    private String color;


    public Notebook(Integer ram, Integer rom, String os, String color){
        this.ram = ram;
        this.rom = rom;
        this.os = os;
        this.color = color;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Оперативная память %d Гб, объем жесткого диска %d Гб, Операционная система: %s, цвет %s ", ram, rom, os, color);
    }

    @Override
    public int hashCode() {
        
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Notebook t = (Notebook) obj;
        return os == t.os || color == t.color;
    }

    public String getColor() {
        return this.color;
    }

    public String getOs() {
        return this.os;
    }

    public Integer getRam() {
        return this.ram;
    }

    public Integer getRom() {
        return this.rom;
    }
}
