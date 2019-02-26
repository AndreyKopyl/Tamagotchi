package package_1;

import java.util.Scanner;

public class StartProgram {

    private String name;

    public String namePets(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter pet name: ");
        name = in.nextLine();
        System.out.println("Your pet's name: " + name);

        return name;
    }

    public String getName() {
        return name;
    }

    public void startProgram(){
        System.out.println("Choose a pets: ");
        String petView = "1. Cat " + "2. Dog";
        Scanner in = new Scanner(System.in);
        System.out.println(petView);
        petView = in.nextLine();

        StartProgram start = new StartProgram();
        start.namePets();

        Menu menu = new Menu();
        switch(petView){
            case "1":
                menu.mainMenuCat();
                break;
            case "2":
                menu.mainMenuDog();
                break;
        }

    }

}
