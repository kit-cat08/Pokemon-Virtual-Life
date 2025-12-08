

public class Charizard {
private String type = "Fire/Flying";
private int age = 70;
private int health;
private int happiness; 
private int energy;
private int combatLevel;
// Constructor: Construct Charizard copying data into the instance variables 
public Charizard(int theHealth, int theHappiness, int theEnergy, int theCombatLevel){
    health = theHealth;
    happiness = theHappiness;
    energy = theEnergy;
    combatLevel = theCombatLevel;
}
public Charizard() {
    health = 100; // Default health
    happiness = 50; // Default happiness
    energy = 100; // Default energy
    combatLevel = 10; // Default combat level
}
public void fly(){
    System.out.println("WHOOSH WHOOSH CHARRRRR! Charizard is flying!!!");
    energy-=20;
    happiness +=20;
}

}