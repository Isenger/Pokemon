
public class Trainer extends Player{

    public Trainer(String newName){
        super(newName, "PokemonTrainer");
        maxHp = 50;
        maxMp = 30;
        hp = maxHp;
        mp = maxMp;
        exp = 0;
        myDmg = 10;
        playerPic = "Trainer.jpg";
    }
    
}