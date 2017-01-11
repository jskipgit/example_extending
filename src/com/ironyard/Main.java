package com.ironyard;

public class Main {

    public static void main(String[] args) {
	    // declare my Animal reference
        Animal myPet;

        // declare and assign
        Animal my2ndPet = new Animal();

        myPet = new Animal();
        myPet.lbs = 400;
        myPet.name = "Gorilla";

        my2ndPet.lbs = 400;
        my2ndPet.name = "Gorilla";

        System.out.println(my2ndPet.name);
        Main.changeName(my2ndPet);
        System.out.println(my2ndPet.name);

        int x = 7;
        System.out.println(x);
        x = Main.changeValue(x);
        System.out.println(x);

    }
    public static int changeValue(int whatever){
        whatever = whatever + 10;
        return whatever;
    }

    public static void changeName(Animal a){
        a.name = a.name + "changed";
    }
}
