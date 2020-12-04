package com.company;

public class Ogre extends OsnovaXD implements Printable{

    public Ogre(String name, int HP) {
        super.setName(name);
        super.setHealPoints(HP);
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + " HP: " + getHealPoints());
    }
}
