package com.company;

public class Warrior extends OsnovaXD implements Printable{
    public Warrior(String name, int HP) {
        super.setName(name);
        super.setHealPoints(HP);
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + " HP: " + getHealPoints());
    }
}
