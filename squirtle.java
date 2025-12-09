public class squirtle {
    private int health;
    private int energy;
    private int happiness;
    private int age;
    private int combatLvl;
    private final String type = "Water";

    public squirtle(int theHealth, int theEnergy, int theHappiness, int theAge, int theCombatLvl) {
        health = theHealth;
        energy = theEnergy;
        happiness = theHappiness;
        age = theAge;
        combatLvl = theCombatLvl;
    }
    public squirtle() {
        health = 100;
        energy = 100;
        happiness = 100;
        age = 1;
        combatLvl = 1;
    }

}

