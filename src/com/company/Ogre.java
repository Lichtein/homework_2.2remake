package com.company;

public class Ogre extends OsnovaXD implements Printable{

    int Age;
    int Damage;
    int Rage;

    public Ogre(String name, int HP, int Age, int Damage, int Rage) {
        super.setName(name);
        super.setHealPoints(HP);
        this.Age = Age;
        this.Rage = Rage;
        this.Damage = Damage;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + " HP: " + getHealPoints() + " Age: " + Age + " Damage: " + Damage + " Rage: " + Rage + " sec");
    }
}
