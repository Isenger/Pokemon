import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class Kaiju extends Pokemon
{
    public Kaiju(String name){
        super(name);
        level = (int)(Math.random()*30)+10;
        hpMax = 100 + (level*10);
    }
    public void getDamage(Pokemon enemy){
        System.out.println("Pokemon" + getName() + "attack" +  enemy.getName());
    }
}