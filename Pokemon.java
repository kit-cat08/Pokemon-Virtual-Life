/**
 * This is the pokemon interface that defines the methods that all Pokemon classes must implement.
 * @author Cathy Vo, Kolion Borden, Aidan Manzanares, Annabelle Phan
 * @version 12/15/2025
 */
interface Pokemon {
    public void attack();
    public void feed();
    public void showInfo();
    public void train();
    public void sleep();
    public void play();
    public void uniqueBehavior();
    public int getHealth();
    public void setHealth(int health);
    public int getEnergy();
    public void setEnergy(int energy);
    public int getHappiness();
    public void setHappiness(int happiness);
    public int getAge();
    public void setAge(int age);
    public int getCombatLvl();
     public void setCombatLvl(int combatLvl);

}
