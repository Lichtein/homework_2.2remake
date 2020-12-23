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
                printable = new Warrior("Warrior", 2500, 46, 400, 500);
                break;
            case "Ogre":
                printable = new Ogre ("Ogre", 2000, 36, 450, 300);
                break;
            case "Medic":
                printable = new Medic("Medic", 1000, 24,380, 450);
                break;

        }


        return printable;


    }



}
