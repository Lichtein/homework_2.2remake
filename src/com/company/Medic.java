package com.company;

public class Medic extends OsnovaXD implements Printable{

    int Age;
    int Damage;
    int Heal;

    public Medic(String name, int HP, int Age, int Damage, int Heal) {
        super.setName(name);
        super.setHealPoints(HP);
        setAge(Age);
        setDamage(Damage);
        setHeal(Heal);
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

    public int getHeal() {
        return Heal;
    }

    public void setHeal(int heal) {
        Heal = heal;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + " HP: " + getHealPoints() + " Age: " + Age + " Damage: " + Damage + " Heal canister" + Heal + "/250");

    }
}
