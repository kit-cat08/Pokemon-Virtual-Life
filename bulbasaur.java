/**This class represents a Bulbasaur Pokemon with various attributes and behaviors.
*It implements the Pokemon interface and provides concrete implementations for all required methods.
*@author Kolion Borden
*@version  12/9/2025
*/
public class bulbasaur implements Pokemon {
private final String type = "Grass/Poison";
private int health;
private int happiness;
private int age;
private int energy;
private int combatLevel;
@Override
public void setHealth(int health) {
    this.health = health;
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
public int getEnergy() {
    return energy;
}
@Override
public void setEnergy(int energy) {
    this.energy = energy;
}
@Override
public int getCombatLvl() {
    return combatLevel;
}
@Override
public void setCombatLvl(int combatLevel) {
    this.combatLevel = combatLevel;
}
//constructor
public bulbasaur(int health, int happiness, int age, int energy, int combatLevel) {
    this.health = health;
    this.happiness = happiness;
    this.age = age;
    this.energy = energy;
    this.combatLevel = combatLevel;
}
public bulbasaur() {
    this.health = 60;
    this.happiness = 60;
    this.age = 1;
    this.energy = 60;
    this.combatLevel = 1;
}
//display attack message, reduce energy, increase combat level
@Override
public void attack() {
    System.out.println("Bulbasaur uses Vine Whip!");
    energy -= 10;
    combatLevel += 1;

}
//feed method to increase health and happiness
@Override
public void feed() {
    System.out.println("Bulbasaur is eating some berries.");
    health += 10;
    happiness += 5;
}
//showInfo method to display current stats
@Override
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
@Override
public void train() {
    System.out.println("Training Bulbasaur...");
    combatLevel += 2;
    energy -= 15;
}
//sleep method to restore energy
@Override
public void sleep() {
    System.out.println("Bulbasaur is sleeping.");
    energy += 20;
}
//play method to increase happiness and reduce energy
@Override
public void play() {
    System.out.println("Playing with Bulbasaur.");
    happiness += 10;
    energy -= 5;
}
//unique behavior method
@Override
public void uniqueBehavior() {
    System.out.println("Bulbasaur uses its Vine Whip to swing around!");
}
@Override
public int getHealth() {
    return health;

}
}