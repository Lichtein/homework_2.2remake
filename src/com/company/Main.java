package com.company;

public class Main {


    public static void main(String[] args) {
        createObject("Ogre").print();
        createObject("Warrior").print();
        createObject("Medic").print();




    }
    public static Printable createObject(String className){
        Printable printable = null;



        switch (className){

            case "Warrior":
                printable = new Warrior("Warrior", 150);
                break;
            case "Ogre":
                printable = new Ogre("Ogre", 200);
                break;
            case "Medic":
                printable = new Medic("Medic", 89);
                break;

        }


        return printable;


    }



}
