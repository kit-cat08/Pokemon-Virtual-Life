public class squirtle {
    private int health;
    private int energy;
    private int happiness;
    private int age;
    private int combatLvl;
    private final String type = "Water";


    /*
    Constructors for Squirtle.
    */
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


    /*
    Method for feeding Squirtle and increasing health and happiness.
    
    */

    public void feed() {
        System.out.println("Squirtle is eating Berries!");
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
    This method displays the current information about the Squirtle.
     */
    public void showInfo() {
        System.out.println("Squirtle Info:");
        System.out.println("Type: " + type);
        System.out.println("Health: " + health);
        System.out.println("Energy: " + energy);
        System.out.println("Happiness: " + happiness);
        System.out.println("Age: " + age + " years");
    }
    /*
    This method simulates training Squirtle, increasing its combat level and reducing its energy and happiness.
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
    This method simulates Squirtle sleeping, restoring energy and happiness.
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
    This method simulates Squitle playing, increasing its happiness and reducing its energy. f
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





}

