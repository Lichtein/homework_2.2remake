package com.company;

public class Ogre extends OsnovaXD implements Printable{

    int Age = 37;
    int Damage = 100;
    int Rage = 3000;

    public Ogre(String name, int HP) {
        super.setName(name);
        super.setHealPoints(HP);
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + " HP: " + getHealPoints() + " Age: " + Age + " Damage: " + Damage + " Rage: " + Rage + " sec");
    }
}
