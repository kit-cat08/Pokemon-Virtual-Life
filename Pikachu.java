/*
This class represents a Pikachu and has various attributes and methods to interact with it. It implements the Pokemon interface.
@author Cathy Vo
@version 12/9/2025
 */
public class Pikachu implements Pokemon{
    private int health;
    private int energy;
    private int happiness;
    private int age;
    private int combatLvl;
    private final String type = "Electric";

    public Pikachu(int theHealth, int theEnergy, int theHappiness, int theAge, int theCombatLvl) {
        health = theHealth;
        energy = theEnergy;
        happiness = theHappiness;
        age = theAge;
        combatLvl = theCombatLvl;
    }
    public Pikachu() {
        health = 100;
        energy = 100;
        happiness = 100;
        age = 1;
        combatLvl = 1;
    }
    /*
    This method returns the health of the Pikachu.
     */
    public int getHealth(){
        return health;
    }
    /*
    This method simulates an attack by the Pikachu, reducing its energy and increasing its combat level.
     */
    public void attack() {
        System.out.println("Pikachu uses Thunderbolt!");
        energy -= 10;
        combatLvl += 2;
        if (energy < 0) {
            energy = 0;
        }
        if (combatLvl > 100) {
            combatLvl = 100;
        }
    }
    /*
    This method simulates feeding the Pikachu, increasing its health and happiness.
    */
    public void feed() {
        System.out.println("Pikachu is eating Berries!");
        health += 10;
        happiness += 5;
        if (health > 100) {
            health = 100;
        }
        if (happiness > 100) {
            happiness = 100;
        }
    }
    /*
    This method displays the current information about the Pikachu.
     */
    public void showInfo() {
        System.out.println("Pikachu Info:");
        System.out.println("Type: " + type);
        System.out.println("Health: " + health);
        System.out.println("Energy: " + energy);
        System.out.println("Happiness: " + happiness);
        System.out.println("Age: " + age + " years");
    }
    /*
    This method simulates training the Pikachu, increasing its combat level while reducing its energy and happiness.
     */
    public void train() {
        System.out.println("Pikachu is training!");
        combatLvl += 5;
        energy -= 15;
        happiness -= 5;
        if (energy < 0) {
            energy = 0;
        }
        if (happiness < 0) {
            happiness = 0;
        }
    }
    /*
    This method simulates the Pikachu sleeping, restoring its energy and happiness.
     */
    public void sleep(){
        System.out.println("Pikachu is sleeping!");
        energy += 20;
        happiness += 10;
        if (energy > 100) {
            energy = 100;
        }
        if (happiness > 100) {
            happiness = 100;
        }
    }
    /*
    This method simulates the Pikachu playing, increasing its happiness while reducing its energy.
     */
    public void play(){
        System.out.println("Pikachu is playing!");
        happiness += 15;
        energy -= 10;
        if (happiness > 100) {
            happiness = 100;
        }
        if (energy < 0) {
            energy = 0;
        }
    }
    /*
    This method demonstrates Pikachu's unique behavior.
     */
    public void uniqueBehavior() {
        System.out.println("Pikachu is using its unique ability: Static!");
        System.out.println("Anyone who touches Pikachu may get paralyzed!");

    }


}
