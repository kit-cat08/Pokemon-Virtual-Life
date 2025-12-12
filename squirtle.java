/*
This class represents a Squirtle and implements the Pokemon interface to use various methods.
@author Aidan Manzanares
@version 12/9/2025
 */


public class squirtle implements Pokemon {
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
        health = 50;
        energy = 50;
        happiness = 50;
        age = 1;
        combatLvl = 1;
    }

    /*
    Simulates Squirtle attacking and calculates damage based on level.
    */
    @Override
    public void attack() {
        System.out.println("Squirtle uses Tackle!");
        energy -= 10;
        combatLvl += 2;

    }


    /*
    Method for feeding Squirtle and increasing health and happiness.
    
    */
    @Override
    public void feed() {
        System.out.println("Squirtle is eating Berries!");
        health += 10;
        happiness += 5;
    }
    /*
    This method displays the current information about the Squirtle.
     */
    @Override
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
    @Override
    public void train() {
        System.out.println("Pikachu is training!");
        combatLvl += 5;
        energy -= 15;
        happiness -= 5;

    }
    /*
    This method simulates Squirtle sleeping, restoring energy and happiness.
     */
    @Override
    public void sleep(){
        System.out.println("Pikachu is sleeping!");
        energy += 20;
        happiness += 10;

    }
    /*
    This method simulates Squitle playing, increasing its happiness and reducing its energy. f
     */
    @Override
    public void play(){
        System.out.println("Pikachu is playing!");
        happiness += 15;
        energy -= 10;
        
    }

        /*
        Squirtle's unique behavior: Using Water Gun attack. Calculates damage based on combat level.
        */
        @Override
        public void uniqueBehavior(){
            int damage = 40 * ((combatLvl + 1)/ 10);
            System.out.println("Squirtle used Water Gun! It dealt " + damage + " damage!"); 
        }
    


    /*
    Getter and setter methods.
    */
    @Override
    public int getHealth() {
        return health;
    }
    @Override
    public void setHealth(int health) {
        this.health = health;
    }
    @Override
    public int getEnergy() {
        return energy;
    }
    @Override
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    @Override
    public int getHappiness() {
        return happiness;
    }

@Override
    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    @Override
    public int getAge() {
        return age;
    }

@Override
    public void setAge(int age) {
        this.age = age;
    }

@Override
    public int getCombatLvl() {
        return combatLvl;
    }

@Override
    public void setCombatLvl(int combatLvl) {
        this.combatLvl = combatLvl;
    }






    }










