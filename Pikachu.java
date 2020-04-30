import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class Pikachu extends Pokemon
{
    public Pikachu(String name){
        super(name);
        level = (int)(Math.random()*10)+1;
        hpMax = 50 + (level*5);
    }
    public void getDamage(Pokemon enemy){
        System.out.println("Pokemon" + getName() + "attack" +  enemy.getName());
    }
}