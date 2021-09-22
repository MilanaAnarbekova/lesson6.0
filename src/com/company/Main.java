package com.company;

/* ДЗ на сообразительность:
        Распечатывание информации сделать в методе в классе Босса public String printInfo(){}
        Создать класс Skeleton (Скелет), унаследовать от Босса.
        Добавить поле (кол-во стрел) и добавить геттеры и сеттеры.
        Переопределить родительский метод printInfo в классе Skeleton
        В Main распечатать информацию о Боссе с помощью метода printInfo,
        также создать 2 экземпляра скелета и заполнить данными) затем распечатать всю информацию о скелетах.*/
public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(400, 40, new Weapon("suriken","cold"));
        System.out.println(boss.printInfo() );
        Skeleton skeleton = new Skeleton(300,50,
                new Weapon("bow","cold"),7);
        System.out.println(skeleton.printInfo() + " ");
        Skeleton skeleton2 = new Skeleton(306,40,
                new Weapon("bow","cold"),9);
        System.out.println(skeleton2.printInfo() + " ");

    }
}
