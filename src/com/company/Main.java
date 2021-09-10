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
        boss.setDamage(60);
        boss.setHealth(500);
        boss.weapon.setWeaponName("suriken");
        boss.weapon.setWeaponType("cold");

        System.out.println("Boss damage = " + boss.getDamage() + " ;" +
                " Boss health = " + boss.getHealth() +
                " ;" + "Boss weapon name = " + boss.weapon.getWeaponName()
                + ";" + " Boss weapon type = " + boss.weapon.getWeaponType());
        System.out.println();
    }
}
