import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Novice
{   
    Scanner select = new Scanner(System.in);
    Inventory bag = new Inventory();
    Monster mon = new Monster();
    protected int hpMax = 100;
    protected int mpMax = 30;
    protected int expMax = 100;
    protected int hp ;
    protected int mp ;
    protected int exp = 0;
    protected int level = 1;
    protected int beginDamage = 20;
    protected int damage = 0;
    //protected int monDamage = 0;
    protected int fireball = 15;
    
    //Scanner select = new Scanner(System.in);
    
    public void getDamage(int monDamage){
        //int i = 0;
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
        }
    }
    public void minusZero(){//Use in second time
        mp = mpMax;
        if(mp == 0){
            System.out.println("Mana Empty");
            System.out.println("if use you get damage");
        }
        //if(mp > 0){
          //  mp = mp - fireball;
        //}
        if(mp < 0){
            hp = hp + mp - fireball;
        }
    }
    public void expUp(int hpMon){   
        while(exp <= expMax){
            damage += beginDamage;
            if(damage == hpMon){
                exp = exp + 10;
                damage = beginDamage;
            }
        }  
    } 
    public int levelUp(){
        if(exp >= expMax){
            hpMax = hpMax + (10 * level);
            mpMax = mpMax + (5 * level);
            exp = exp - expMax;
            expMax = expMax + 100;
            hp = hpMax;
            mp = mpMax;
            level += 1;
        }
        return level;
    }
    public int showHp(){
        return hp ;
    }
    public int showMp(){
        return mp ;
    }
    public int showExp(){
        return exp ;
    }
    public void useitem(){
        System.out.println("!!!Choose you item!!!");
        System.out.println("Choose #1 : Weapon");
        System.out.println("Choose #2 : Amror");
        System.out.println("Choose #3 : hpPotion");
        System.out.println("Choose #4 : mpPotion");
        System.out.println("Choose you item :");
        
        if(select.nextInt() == 1){
            bag.useWeapon();     
        }
        if(select.nextInt() == 2){
            bag.useAmror();
        }
        if(select.nextInt() == 3){
            bag.usePotion();
            print("Hp +30");
        }
        if(select.nextInt() == 4){
            bag.usePotion();
            print("Mp +20");
        }
    }
    public void checkItem(){
        bag.item();
    } 
}
