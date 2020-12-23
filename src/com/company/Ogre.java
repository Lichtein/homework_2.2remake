package com.company;

public class Ogre extends OsnovaXD implements Printable{

    int Age;
    int Damage;
    int Rage;

    public Ogre(String name, int HP, int Age, int Damage, int Rage) {
        super.setName(name);
        super.setHealPoints(HP);
        setAge(Age);
        setDamage(Damage);
        setRage(Rage);

    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public int getRage() {
        return Rage;
    }

    public void setRage(int rage) {
        Rage = rage;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + " HP: " + getHealPoints() + " Age: " + Age + " Damage: " + Damage + " Rage: " + Rage + " sec");
    }
}
