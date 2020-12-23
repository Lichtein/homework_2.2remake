package com.company;

public class Medic extends OsnovaXD implements Printable{

    int Age = 37;
    int Damage = 100;
    int Heal = 250;

    public Medic(String name, int HP) {
        super.setName(name);
        super.setHealPoints(HP);
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + " HP: " + getHealPoints() + " Age: " + Age + " Damage: " + Damage + " Heal canister" + Heal + "/250");

    }
}
