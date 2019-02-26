package package_1;

import java.util.Scanner;

public class MainMenuFunctions {

    public void info(){
        StartProgram name = new StartProgram();

        System.out.println("Your pet's name: " + name.getName());
        System.out.println("Fatigue value: " );
    }

    public void restartProgram(){

        StartProgram start = new StartProgram();
        System.out.println("Restart the program?");
        Scanner in = new Scanner(System.in);
        String a = "1. Yes " + "2. No ";
        System.out.println(a);
        a = in.nextLine();
        switch (a){
            case "1":
                start.startProgram();
                break;
            case "2":
                break;
        }
    }

    public void sleepCat() {
        Cat cat = new Cat();
        cat.sleep();
    }

    public void sleepDog(){
        Dog dog = new Dog();
        dog.sleep();
    }

    public void feedCat(){
        Cat cat = new Cat();
        cat.feed();
    }

    public void feedDog(){
        Dog dog = new Dog();
        dog.feed();
    }

    public void specialActionCat(){
        Cat cat = new Cat();
        cat.specialAction();
    }

    public void specialActionDog(){
        Dog dog = new Dog();
        dog.specialAction();
    }
}
