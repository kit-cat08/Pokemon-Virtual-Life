public class bulbasaur {
private String type = "Grass/Poison";
private int health;
private int happiness;
private int age;
private int energy;
private int combatLevel;
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
public void attack() {
    System.out.println("Bulbasaur uses Vine Whip!");
    energy -= 10;
    combatLevel += 1;
    if (energy < 0) {
        energy = 0;
    }

}








}
