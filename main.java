import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Pokemon Simulator!");
        System.out.println("Choose your pokemon: Pikachu, Bulbasaur, Squirtle, Charizard");
        String pokemonType = scanner.nextLine().toLowerCase();
        Pokemon pet = createPokemon(pokemonType);

        

        
    }

/*
This method allows the user to choose the action for the Pokemon based on their input 
@param pokemon The Pokemon object 
@param scanner The scanner for user input 
@author Annabelle Phan 
*/
public static void choosePokemonAction(Pokemon pokemon, Scanner scanner){
    System.out.println("Choose an action for your Pokemon: \nfeed \nsleep \ntrain \nplay \nunique Behavior \ninfo ");
    String action = scanner.nextLine().toLowerCase();
    switch (action){
        case "feed":
            pokemon.feed();
            break;
        case "sleep":
            pokemon.sleep();
            break;
        case "train":
            pokemon.train();
            break;
        case "play":
            pokemon.play();
            break;
        case "unique behavior":
            pokemon.uniqueBehavior();
            break;
        case "show info":
            pokemon.showInfo();
            break;
        default:
            System.out.println("Invalid action. Please choose again.");
            break;

    
    }
}



/*
This method creates a Pokemon object based on the given type from the user
@param pokemonType The type of Pokemon to create
@return A Pokemon object of the specified type
@author Cathy Vo
*/
public static Pokemon createPokemon(String pokemonType){
    switch (pokemonType.toLowerCase()){
        case "pikachu":
            return new Pikachu();
        case "bulbasaur":
            return new bulbasaur();
        case "squirtle":
            return new squirtle();
        case "charizard":
            return new Charizard();
        default:
            return null;
    }   
}

/*
Checks the Pokemon's health to see if the Pokemon is alive. 
@param pet The Pokemon object to check
@return true if the Pokemon is dead, false otherwise
@author Aidan Manzanares
*/

public static boolean isDead(Pokemon pet){
        int health = pet.getHealth();
        if (health <= 0){
            System.out.println("Your Pokemon has fainted!");
            return true;
        }
        else if (health > 100){
            System.out.println("Your Pokemon has fainted from exertion!");
            return true;
        }
        else {
            return false;
        }
}





public static void randomEvent(Pokemon pokemon){
    int event = (int)(Math.random() * 100);
   if (event% 5==0){
            System.out.println("Your Pokemon found a health potion!");
            pokemon.setHealth(pokemon.getHealth() + 20); }
    else if (event % 3 ==0){
            System.out.println("Your Pokemon got attacked by a wild Pokemon!");
            pokemon.setHealth(pokemon.getHealth() - 15); }
    else if (event == 1){
            System.out.println("Your Pokemon fell into a pit!");
            pokemon.setHealth(pokemon.getHealth() - 30);
    }   

}


// DO NOT DELETE THIS BRACKET
}