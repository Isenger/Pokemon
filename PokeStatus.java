
public class PokeStatus {
    protected int hp;
    protected int mp;
    protected int exp;
    protected int level;
    protected int maxHp;
    protected int maxMp;
    protected int pokeDmg;
    private String pokename;
    protected String pokePic;
    public PokeStatus(String newPokeName,String g) {
        this.pokename = newPokeName;
        level = 1;
        maxHp = 0;
        maxMp = 0;
        hp = maxHp;
        mp = maxMp;
        exp = 0;
        pokePic ="";
    }
    public String getPokeName(){
        return pokename;
    }

    public int getPokemaxHp(){
        return maxHp;
    }

    public int getPokehp() {
        return hp;
    }

    public int getPokeMaxMp(){
        return maxMp;
    }

    public int getPokeMp(){
        return mp;
    }

    public int getPokeexp() {
        return exp;
    }

    public int getPokelvl() {
        return level;
    }

    public int getPokeDmg(){
        return pokeDmg;
    }
    public String getPokePic(){
        return pokePic;
    }
}