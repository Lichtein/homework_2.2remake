package com.company;

public class Medic extends OsnovaXD implements Printable{
    public Medic(String name, int HP) {
        super.setName(name);
        super.setHealPoints(HP);
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + " HP: " + getHealPoints());

    }
}
