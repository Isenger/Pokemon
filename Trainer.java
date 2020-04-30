import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Trainer{
    private ArrayList<Pokemon> bag;
    private ArrayList<Inventory> itemBag;
    private Scanner sc;

    public Trainer(){
        bag = new ArrayList<Pokemon>();
        bag.add(new Pikachu("Type Zero"));
        sc = new Scanner(System.in);
    }
    public void printPokemon(){
        System.out.println("Pokemon in bag");
        for(Pokemon p: bag){
            System.out.println(p);
        }
    }
    public void catchPokemon(){
        System.out.println("Pokemon founded :");
        System.out.println("================================================================");
        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
        int pokemonNumber = (int)(Math.random()*5)+1;
        for(int i=0; i<pokemonNumber; ++i){
            int type = (int)(Math.random()*3);
            if(type==0)
                pokemons.add(new Pikachu("Wild Pikachu"));
            else if(type==1)
                pokemons.add(new Slime("Wild Slime"));
            else if(type==2)
                pokemons.add(new Kaiju("Wild Kaiju"));
        }
       
        int num = 0;
        for (Pokemon p :  pokemons){
            System.out.println("#" + num + " " + p.getName());
            num++;
        } 
        System.out.println("================================================================");
        System.out.print("Choose you enemy : ");
        num = sc.nextInt();

        bag.add(pokemons.get(num));
    }
    public void usePotion(){
        
    }
    /*int i = 0;
        hp = hpMax;
        while(hp <= hpMax){
            hp = hp - monDamage;
            //System.out.println("You Hp : " + hp);
        }
        if(hp == 0){
            System.out.println("You Died");
            exp = (exp / 2) - (10 * level);
            if(exp < 0){
                exp = 0;
            }
        }*/
}