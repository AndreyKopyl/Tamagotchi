package package_1;

public class Cat extends Animal implements Pets {


    @Override
    public int specialAction() {
        int fatigueValue;
        fatigueValue = getFatigue() - 50;
        if (fatigueValue > 0) {
            System.out.println("Cat meows. Fatigue: " + fatigueValue);
        }else{
            System.out.println("The animal was taken to the hospital and you can no longer use it.");
        }

        return fatigueValue;
    }
}
