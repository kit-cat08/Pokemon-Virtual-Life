/***
 * Charizard class which implements the Pokemon interface.
 * This class represents a Charizard Pokemon with attributes such as type, age, health, happiness, energy, and combat level.
 * It includes methods to perform actions like attack, feed, showInfo, train, sleep, play, and a unique behavior of flying.
 * Author: Annabelle Phan 
 * Date: December 9, 2025
 */

public class Charizard implements Pokemon {
private final String type = "Fire/Flying";
private int age;
private int health;
private int happiness; 
private int energy;
private int combatLevel;
// Constructor: Construct Charizard copying data into the instance variables 
public Charizard(int theHealth, int theHappiness, int theEnergy, int theCombatLevel, int theAge){
    health = theHealth;
    happiness = theHappiness;
    energy = theEnergy;
    combatLevel = theCombatLevel;
    age = theAge;
}
public Charizard() {
    health = 50; // Default health
    happiness = 50; // Default happiness
    energy = 50; // Default energy
    combatLevel = 10; // Default combat level
    age = 70;

}
//Interface methods
@Override
public void attack(){
    System.out.println("Charizard uses Flamethrower!");
    energy -= 20;
    combatLevel += 20;
}
@Override
public void feed(){
    System.out.println("You feed Charizard a hearty meal.");
    health += 20;
    happiness += 20;
    energy += 20;
}
@Override
public void showInfo() {
    // Displays the current state of Charizard's attributes
    System.out.println("Charizard Info:");
    System.out.println("Type: " + type);
    System.out.println("Age: " + age);
    System.out.println("Health: " + health);
    System.out.println("Happiness: " + happiness);
    System.out.println("Energy: " + energy);
    System.out.println("Combat Level: " + combatLevel);
}
@Override
public void train() {
    // Simulates training Charizard to improve its combat skills
    System.out.println("You train Charizard to improve its combat skills.");
    combatLevel += 15;
    energy -= 15;    
    happiness += 10;  
}
@Override
public void sleep() {
    // Simulates Charizard sleeping to restore energy and health
    System.out.println("Charizard is sleeping to restore energy.");
    energy += 30;    
    health += 10; 
}
@Override
public void play() {
    // Simulates playing with Charizard to increase happiness
    System.out.println("You play with Charizard, jumping around and having fun!");
    happiness += 25;
    energy -= 10;    
}
@Override
public void uniqueBehavior() {
    // Simulates Charizard's unique behavior of flying
    System.out.println("WHOOSH WHOOSH CHARRRRR! Charizard is flying!!!");
    energy -= 20;  
    happiness += 20; 
    age += 1;     
}

// Getter and Setter for 'age'
@Override
public int getAge() {
    return age;
}

@Override
public void setAge(int age) {
    this.age = age;
}
@Override
// Getter and Setter for 'health'
public int getHealth() {
    return health;
}
@Override
public void setHealth(int health) {
    this.health = health;
}

// Getter and Setter for 'happiness'
@Override
public int getHappiness() {
    return happiness;
}
@Override
public void setHappiness(int happiness) {
    this.happiness = happiness;
}

// Getter and Setter for 'energy'
@Override
public int getEnergy() {
    return energy;
}
@Override
public void setEnergy(int energy) {
    this.energy = energy;
}

// Getter and Setter for 'combatLevel'
@Override
public int getCombatLvl() {
    return combatLevel;
}
@Override
public void setCombatLvl(int combatLevel) {
    this.combatLevel = combatLevel;
}

}
