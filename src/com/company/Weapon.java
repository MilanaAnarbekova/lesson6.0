package com.company;

public class Weapon {
    private String weaponName;
    private String weaponType;

    public Weapon(String weaponName, String weaponType) {
        this.weaponType = weaponType;
        this.weaponName = weaponName;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

}
