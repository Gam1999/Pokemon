//Show results
public class PokemonGame{
    public static void main (String args[]){
        Pokemon pokemon = new Pokemon();
        System.out.println("//initial Status//");
        pokemon.printStatus();

        System.out.println("//update Status//");
        pokemon.eatBerry();
        pokemon.sleep();
        pokemon.run();
        pokemon.attack();
        pokemon.faint();
        pokemon.printStatus();
    }
    


}
