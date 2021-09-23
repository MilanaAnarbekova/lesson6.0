package com.company;

public class Boss extends GameEntity {
    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + " " + weapon.getWeaponName() + " " + weapon.getWeaponType();
    }

}

