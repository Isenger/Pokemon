import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public abstract class Pokemon{   
    //Scanner select = new Scanner(System.in);
    //Inventory bag = new Inventory();
    //Monster mon = new Monster();
    protected int hpMax;
    protected int mpMax;
    //protected int expMax = 100;
    protected int hp;
    protected int mp;
    //protected int exp = 0;
    protected int level;
    protected int levelMax = 100;
    //protected int beginDamage = 20;
    //protected int damage = 0;
    //protected int monDamage = 0;
    protected String name;
    
    public Pokemon(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return name;
    }
    public boolean getDamage(int value){
        hp = hpMax;
        if(hpMax == 0){
            return false;
        }
        int currentHp = hp - value; 
        if(currentHp >= 0){ 
            this.hp = currentHp;
            return true;
        }
        else { 
            this.hp = 0;
            return true;
        }
    }
    public abstract void getDamage(Pokemon enemy);

    
    
    /*public void expUp(int hpMon){   
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
    } */
}
