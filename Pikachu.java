public class Pikachu extends PokeStatus{

    public Pikachu(String PokeName){
        super(PokeName, "Pikachu");
        maxHp = 100;
        maxMp = 30;
        hp = maxHp;
        mp = maxMp;
        exp = 0;
        pokeDmg = 15;
        pokePic = "Pikachu.png";
    }
    
}