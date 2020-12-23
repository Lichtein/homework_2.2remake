package com.company;

public class Warrior extends OsnovaXD implements Printable{

    int Age;
    int Damage;
    int AngelHeal;

    public Warrior(String name, int HP, int Age, int Damage, int AngelHeal) {
        super.setName(name);
        super.setHealPoints(HP);
        setAge(Age);
        setDamage(Damage);
        setAngelHeal(AngelHeal);
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

    public int getAngelHeal() {
        return AngelHeal;
    }

    public void setAngelHeal(int angelHeal) {
        AngelHeal = angelHeal;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + " HP: " + getHealPoints() + "Age: " + Age + "Damage: " + Damage + "Angel Heal: " + AngelHeal + "HP");
    }
}
