/**
This class represents a Squirtle and implements the Pokemon interface to use various methods.
@author Aidan Manzanares
@version 12/15/2025
 */


public class squirtle implements Pokemon {
    private int health;
    private int energy;
    private int happiness;
    private int age;
    private int combatLvl;
    private final String type = "Water";


    /*
    Constructor for Squirtle.
    @param theHealth The health of the Pokemon 
    @param theEnergy The energy of the Pokemon
    @param theHappiness The Pokemon's happiness
    @param theAge The age of the Pokemon
    @param theCombatLvl The Pokemon's combat level
    @author Aidan Manzanares
    */
    public squirtle(int theHealth, int theEnergy, int theHappiness, int theAge, int theCombatLvl) {
        health = theHealth;
        energy = theEnergy;
        happiness = theHappiness;
        age = theAge;
        combatLvl = theCombatLvl;
    }

 /*
    Overloaded constructor for Squirtle with predefined values for variables
    @author Aidan Manzanares
    */


    public squirtle() {
        health = 50;
        energy = 50;
        happiness = 50;
        age = 1;
        combatLvl = 1;
    }

    /*
    Simulates Squirtle attacking and calculates damage based on level.
    @author Aidan Manzanares
    */
    @Override
    public void attack() {
        System.out.println("Squirtle uses Tackle!");
        energy -= 10;
        combatLvl += 2;

    }


    /*
    Method for feeding Squirtle and increasing health and happiness.
    @author Aidan Manzanares
    */
    @Override
    public void feed() {
        System.out.println("Squirtle is eating Berries!");
        health += 10;
        happiness += 5;
    }
    /*
    This method displays the current information about the Squirtle.
    @author Aidan Manzanares
     */
    @Override
    public void showInfo() {
        System.out.println("Squirtle Info:");
        System.out.println("Type: " + type);
        System.out.println("Health: " + health);
        System.out.println("Energy: " + energy);
        System.out.println("Happiness: " + happiness);
        System.out.println("Age: " + age + " years");
        System.out.println("Combat Level: " + combatLvl);
    }
    /*
    This method simulates training Squirtle, increasing its combat level and reducing its energy and happiness.
    @author Aidan Manzanares
     */
    @Override
    public void train() {
        System.out.println("Squirtle is training!");
        combatLvl += 5;
        energy -= 15;
        happiness -= 5;

    }
    /*
    This method simulates Squirtle sleeping, restoring energy and happiness.
    @author Aidan Manzanares
     */
    @Override
    public void sleep(){
        System.out.println("Squirtle is sleeping!");
        energy += 20;
        happiness += 10;

    }
    /*
    This method simulates Squitle playing, increasing its happiness and reducing its energy.
    @author Aidan Manzanares
     */
    @Override
    public void play(){
        System.out.println("Squirtle is playing!");
        happiness += 15;
        energy -= 10;
        
    }

    /*
    Squirtle's unique behavior: Using Water Gun attack. Calculates damage based on combat level.
    @author Aidan Manzanares
    */
     @Override
     public void uniqueBehavior(){
        int damage = 40 * ((combatLvl / 10) + 1);
        System.out.println("Squirtle used Water Gun! It dealt " + damage + " damage!"); 
    }
    


    
    /* Getter method for health variable.
    @return health.
    @author Aidan Manzanares
    */

    @Override
    public int getHealth() {
        return health;
    }

    /* Setter method for health variable.
    @param health. New health
    @author Aidan Manzanares
    */


    @Override
    public void setHealth(int health) {
        this.health = health;
    }

  /* Getter method for energy variable.
    @return energy
    @author Aidan Manzanares
    */

    @Override
    public int getEnergy() {
        return energy;
    }

  /* Setter method for energy variable.
    @param energy New energy
    @author Aidan Manzanares
    */

    @Override
    public void setEnergy(int energy) {
        this.energy = energy;
    }

  /* Getter method for happiness variable.
    @return happiness
    @author Aidan Manzanares
    */

    @Override
    public int getHappiness() {
        return happiness;
    }


  /* Setter method for energy variable.
    @param happiness New happiness
    @author Aidan Manzanares
    */


@Override
    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

  /* Getter method for age variable.
    @return age
    @author Aidan Manzanares
    */

    @Override
    public int getAge() {
        return age;
    }

  /* Setter method for age variable.
    @param age New age
    @author Aidan Manzanares
    */

@Override
    public void setAge(int age) {
        this.age = age;
    }


  /* Getter method for combatLvl variable.
    @return combatLvl
    @author Aidan Manzanares
    */


@Override
    public int getCombatLvl() {
        return combatLvl;
    }

  /* Setter method for combatLvl variable.
    @param combatLvl New combatLvl
    @author Aidan Manzanares
    */

@Override
    public void setCombatLvl(int combatLvl) {
        this.combatLvl = combatLvl;
    }






    }










