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
        Boss boss = new Boss();
        boss.weapon.setWeaponType("Огнестрельный");
        boss.weapon.setWeaponName("Пистолет");
        boss.setDamage(45);
        boss.setHealth(800);
        System.out.println(boss.printInfo());
        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(600);
        skeleton.setDamage(20);
        skeleton.weapon.setWeaponType("Дальнобойное");
        skeleton.weapon.setWeaponName(" Лук");
        skeleton.setNumberOfArrows(25);
        System.out.println(skeleton.printInfo() + " ");
        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(400);
        skeleton2.setDamage(30);
        skeleton2.weapon.setWeaponType("Дальнобойное(огненное)");
        skeleton2.weapon.setWeaponName(" Огненный Лук");
        skeleton2.setNumberOfArrows(30);
        System.out.println(skeleton2.printInfo() + " ");

    }
}
