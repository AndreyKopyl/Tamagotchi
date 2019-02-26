package package_1;

import java.util.Scanner;

public class Menu {

    public void mainMenuCat(){

        Scanner in = new Scanner(System.in);

        MainMenuFunctions functions = new MainMenuFunctions();
        String mainMenu = "1. Info" + "\n" + "2. Feed" + "\n" + "3. Sleep" + "\n" + "4. Special Action" + "\n" + "5. Restart";
        System.out.println("Main menu");
        System.out.println("Select an action: ");
        System.out.println(mainMenu);
        mainMenu = in.nextLine();

        switch (mainMenu){
            case "1":
                functions.info();
                break;
            case "2":
                functions.feedCat();
                break;
            case "3":
                functions.sleepCat();
                break;
            case "4":
                functions.specialActionCat();
                break;
            case "5":
                functions.restartProgram();
                break;
        }
    }

    public void mainMenuDog(){

        Scanner in = new Scanner(System.in);

        MainMenuFunctions functions = new MainMenuFunctions();
        String mainMenu = "1. Info" + "\n" + "2. Feed" + "\n" + "3. Sleep" + "\n" + "4. Special Action" + "\n" + "5. Restart";
        System.out.println("Main menu");
        System.out.println("Select an action: ");
        System.out.println(mainMenu);
        mainMenu = in.nextLine();

        switch (mainMenu){
            case "1":
                functions.info();
                break;
            case "2":
                functions.feedDog();
                break;
            case "3":
                functions.sleepDog();
                break;
            case "4":
                functions.specialActionDog();
                break;
            case "5":
                functions.restartProgram();
                break;
        }
    }

}
