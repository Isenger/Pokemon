import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Index
{ 
    public static void main (String[] args)
    {   
        Scanner select = new Scanner(System.in);
        //Novice nov = new Novice();
        Monster mon = new Monster();
        //int choice;
        System.out.println("Hello Newbie Player");
        System.out.println("!!!Choose you action!!!");
        System.out.println("Choose #1 : Duel");
        System.out.println("Choose #2 : Inventory");
        System.out.println("Choose #3 : Status");
        System.out.println("Choose #4 : Logout");
        System.out.println("Choose you action :");

        if(select.nextInt() == 1){
            System.out.println("!!!Choose you enemy! !!");
            System.out.println("Choose #1 : Slime");
            System.out.println("Choose #2 : Elec");
            System.out.println("Choose #3 : Data&network");
            System.out.println("Choose #4 : Static");
            System.out.println("Choose you enemy :");
            int x = select.nextInt();
            nov.getDamage(mon.action(x).damage);

            if(x == 1){
                System.out.println("!!!Choose you action!!!");
                System.out.println("Choose #1 : Physical Attack");
                System.out.println("Choose #2 : Magic Attack");
                System.out.println("Choose #3 : Special Attack");
                
                if(select.nextInt() == 1){
                    nov.expUp(mon.action(x).hp);
                }
                if(select.nextInt() == 2){
                    nov.minusZero();
                }
                select.close();
            }

            if(x == 2){ 
                System.out.println("!!!Choose you action!!!");
                System.out.println("Choose #1 : Physical Attack");
                System.out.println("Choose #2 : Magic Attack");
                System.out.println("Choose #3 : Special Attack");
                
                if(select.nextInt() == 1){
                    nov.expUp(mon.action(x).hp);
                }
                if(select.nextInt() == 2){
                    nov.minusZero();
                }
                select.close();
            }

            if(x == 3){
                System.out.println("!!!Choose you action!!!");
                System.out.println("Choose #1 : Physical Attack");
                System.out.println("Choose #2 : Magic Attack");
                System.out.println("Choose #3 : Special Attack");  

                if(select.nextInt() == 1){
                    nov.expUp(mon.action(x).hp);
                }
                if(select.nextInt() == 2){
                    nov.minusZero();
                    
                }
                select.close();
            }

            if(x == 4){
                System.out.println("!!!Choose you action!!!");
                System.out.println("Choose #1 : Physical Attack");
                System.out.println("Choose #2 : Magic Attack");
                System.out.println("Choose #3 : Special Attack");

                if(select.nextInt() == 1){
                    nov.expUp(mon.action(x).hp);
                    
                }
                if(select.nextInt() == 2){
                    nov.minusZero();
                }
                select.close();
            }
            select.close();
        }

        if(select.nextInt() == 2){
            System.out.println("!!!Choose you action!!!");
            System.out.println("Choose #1 : Check you inventory");
            System.out.println("Choose #2 : Use item");
            if(select.nextInt() == 1){
                nov.checkItem();
                select.close();
            }
            if(select.nextInt() == 2){
                nov.useitem();
                select.close(); 
            }
        }

        if(select.nextInt() == 3){
            //nov.getDamage();
            //nov.minusZero();
            //nov.expUp();
            System.out.println("Level : " + nov.levelUp());
            System.out.println("Level : " + nov.showHp());
            System.out.println("Level : " + nov.showMp());
            System.out.println("Level : " + nov.showExp());
            select.close();
        } 

        if(select.nextInt() == 4){
            System.out.println("Log Out Success");
            select.close();
        } 
        //select.close();     
    } 
    public int getValue(){
        return 0;
    }   
}
