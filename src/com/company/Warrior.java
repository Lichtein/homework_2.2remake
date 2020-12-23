package com.company;

public class Warrior extends OsnovaXD implements Printable{

    int Age;
    int Damage;
    int AngelHeal;

    public Warrior(String name, int HP, int Age, int Damage, int AngelHeal) {
        super.setName(name);
        super.setHealPoints(HP);
        this.Age = Age;
        this.Damage = Damage;
        this.AngelHeal = AngelHeal;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + " HP: " + getHealPoints() + " Age: " + Age + " Damage: " + Damage + " Angel Heal: " + AngelHeal + "HP");
    }
}
