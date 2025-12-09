/**This class represents a Bulbasaur Pokemon with various attributes and behaviors.
*It implements the Pokemon interface and provides concrete implementations for all required methods.
*@author Kolion Borden
*@version  12/9/2025
*/
public class bulbasaur implements Pokemon {
private String type = "Grass/Poison";
private int health;
private int happiness;
private int age;
private int energy;
private int combatLevel;
//constructor
public bulbasaur(int health, int happiness, int age, int energy, int combatLevel) {
    this.health = health;
    this.happiness = happiness;
    this.age = age;
    this.energy = energy;
    this.combatLevel = combatLevel;
}
public bulbasaur() {
    this.health = 100;
    this.happiness = 100;
    this.age = 0;
    this.energy = 100;
    this.combatLevel = 1;
}
//display attack message, reduce energy, increase combat level
public void attack() {
    System.out.println("Bulbasaur uses Vine Whip!");
    energy -= 10;
    combatLevel += 1;
    if (energy < 0) {
        energy = 0;
    }

}
//feed method to increase health and happiness
public void feed() {
    System.out.println("Bulbasaur is eating some berries.");
    health += 10;
    happiness += 5;
    if (health > 100) {
        health = 100;
    }
    if (happiness > 100) {
        happiness = 100;
    }
}
//showInfo method to display current stats
public void showInfo() {
    System.out.println("Bulbasaur Info:");
    System.out.println("Type: " + type);
    System.out.println("Health: " + health);
    System.out.println("Happiness: " + happiness);
    System.out.println("Age: " + age);
    System.out.println("Energy: " + energy);
    System.out.println("Combat Level: " + combatLevel);
}
//train method to increase combat level and reduce energy
public void train() {
    System.out.println("Training Bulbasaur...");
    combatLevel += 2;
    energy -= 15;
    if (energy < 0) {
        energy = 0;
    }
}
//sleep method to restore energy
public void sleep() {
    System.out.println("Bulbasaur is sleeping.");
    energy += 20;
    if (energy > 100) {
        energy = 100;
    }
}
//play method to increase happiness and reduce energy
public void play() {
    System.out.println("Playing with Bulbasaur.");
    happiness += 10;
    energy -= 5;
    if (happiness > 100) {
        happiness = 100;
    }
    if (energy < 0) {
        energy = 0;
    }
}
//unique behavior method
public void uniqueBehavior() {
    System.out.println("Bulbasaur uses its Vine Whip to swing around!");
}
public int getHealth() {
    return health;

}