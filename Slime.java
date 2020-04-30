import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class Slime extends Pokemon
{
    public Slime(String name){
        super(name);
        level = (int)(Math.random()*10)+1;
        hpMax = 10 + (level*3);
    }
    public void getDamage(Pokemon enemy){
        System.out.println("Pokemon" + getName() + "attack" +  enemy.getName());
    }
}