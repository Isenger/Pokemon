import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class PokemonGame
{ 
    public static void main (String[] args)
    {   
        Scanner select = new Scanner(System.in);
        Trainer t = new Trainer();
        System.out.println("================================================================");
        System.out.println("!!!Choose you action!!!");
        System.out.println("================================================================");
        System.out.println("Choose #1 : Catch");
        System.out.println("Choose #2 : Inventory");
        System.out.println("Choose #3 : Status");
        System.out.println("Choose #4 : Logout");
        System.out.println("================================================================");
        System.out.print("Choose you action : ");

        if(select.nextInt() == 1){
            t.catchPokemon(); 
            int x = select.nextInt();
            if(x == 1){
                if(select.nextInt() == 1){       
                }
                if(select.nextInt() == 2){  
                }
                select.close();
            }
            select.close();
        }

        if(select.nextInt() == 2){
            t.printPokemon();
            System.out.println("!!!Choose you action!!!");
            System.out.println("Choose #1 : Check you inventory");
            System.out.println("Choose #2 : Use item");
            if(select.nextInt() == 1){
                
                select.close();
            }
            if(select.nextInt() == 2){
                //nov.useitem();
                select.close(); 
            }
        }

        if(select.nextInt() == 3){
            //nov.getDamage();
            //nov.minusZero();
            //nov.expUp();
            //System.out.println("Level : " + nov.levelUp());
            //System.out.println("Level : " + nov.showHp());
            //System.out.println("Level : " + nov.showMp());
            //System.out.println("Level : " + nov.showExp());
            select.close();
        } 

        if(select.nextInt() == 4){
            System.out.println("Log Out Success");
            select.close();
        }    
    } 
    public int getValue(){
        return 0;
    }   
}
