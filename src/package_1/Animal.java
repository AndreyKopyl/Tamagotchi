package package_1;

public class Animal {

    private int fatigue=100;

    public int getFatigue() {
        return fatigue;
    }

    public void setFatigue(int fatigue) {
        this.fatigue = fatigue;
    }

    public int feed(){
        int fatigueValue;
        fatigueValue = getFatigue() + 20;
        System.out.println("Feeding pet. Fatigue: " + fatigueValue);

        return fatigueValue;
    }

    public int sleep(){
        int fatigueValue;
        fatigueValue = getFatigue() + 30;
        System.out.println("Pet sleeps. Fatigue: " + fatigueValue);

        return fatigueValue;
    }
}
