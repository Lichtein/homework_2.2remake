package com.company;

public class Medic extends OsnovaXD implements Printable{

    int Age;
    int Damage;
    int Heal;

    public Medic(String name, int HP, int Age, int Damage, int Heal) {
        super.setName(name);
        super.setHealPoints(HP);
        this.Heal = Heal;
        this.Damage = Damage;
        this.Age = Age;
    }


    @Override
    public void print() {
        System.out.println("Name: " + getName() + " HP: " + getHealPoints() + " Age: " + Age + " Damage: " + Damage + " Heal canister " + Heal + "/450 ");

    }
}
