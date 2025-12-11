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
    This method sets the health of the Pikachu.
     */
    public void setHealth(int health) {
        this.health = health;
    }
    /*
    This method returns the happinessof the Pikachu.
     */
    public int getHappiness() {
        return happiness;
    }
    /*
    This method sets the happiness of the Pikachu.
     */
    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
    /*
    These method returns the energy of the Pikachu.
     */
    public int getEnergy() {
        return energy;
    }
    /*
    This method sets the energy of the Pikachu.
     */
    public void setEnergy(int energy) {
        this.energy = energy;
    }
    /*
    These method returns the age of the Pikachu.
     */
    public int getAge() {
        return age;
    }
    /*
    This method sets the age of the Pikachu.
    */
    public void setAge(int age) {
        this.age = age;
    }
    /*
    This method returns the combat level of the Pikachu.
     */
    public int getCombatLvl() {
        return combatLvl;
    }
    /*
    This method sets the combat level of the Pikachu.
     */
    public void setCombatLvl(int combatLvl) {
        this.combatLvl = combatLvl;
    }
    /*
    This method simulates an attack by the Pikachu, reducing its energy and increasing its combat level.
     */
    @Override
    public void attack() {
        System.out.println("Pikachu uses Thunderbolt!");
        energy -= 10;
        combatLvl += 2;
    }
    /*
    This method simulates feeding the Pikachu, increasing its health and happiness.
    */
    @Override
    public void feed() {
        System.out.println("Pikachu is eating Berries!");
        health += 10;
        happiness += 5;
    }
    /*
    This method displays the current information about the Pikachu.
     */
    @Override
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
    @Override
    public void train() {
        System.out.println("Pikachu is training!");
        combatLvl += 5;
        energy -= 15;
        happiness -= 5;
    }
    /*
    This method simulates the Pikachu sleeping, restoring its energy and happiness.
     */
    @Override
    public void sleep(){
        System.out.println("Pikachu is sleeping!");
        energy += 20;
        happiness += 10;
    }
    /*
    This method simulates the Pikachu playing, increasing its happiness while reducing its energy.
     */
    @Override
    public void play(){
        System.out.println("Pikachu is playing!");
        happiness += 15;
        energy -= 10;
    }
    /*
    This method demonstrates Pikachu's unique behavior.
     */
    
    @Override
    public void uniqueBehavior(){ 
        System.out.println("Pikachu is using its unique ability: Static!");
        System.out.println("Anyone who touches Pikachu may get paralyzed!");

    }

   


}
