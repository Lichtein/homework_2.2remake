package com.company;

public class Warrior extends OsnovaXD implements Printable{

    int Age = 37;
    int Damage = 100;
    int AngelHeal = 5000;
    public Warrior(String name, int HP) {
        super.setName(name);
        super.setHealPoints(HP);
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + " HP: " + getHealPoints() + "Age: " + Age + "Damage: " + Damage + "Angel Heal: " + AngelHeal + "HP");
    }
}
