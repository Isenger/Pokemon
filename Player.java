
public class Player {
    protected int hp;
    protected int mp;
    protected int exp;
    protected int level;
    protected int maxHp;
    protected int maxMp;
    protected int myDmg;
    private String name;
    public Bag myBag;
    protected String playerPic;

    public Player(String newName,String g) {
        this.name =newName;
        level = 1;
        maxHp = 0;
        maxMp = 0;
        hp = maxHp;
        mp = maxMp;
        exp = 0;
        myDmg = 0;
        myBag =new Bag();
        playerPic ="";
    }

	public String getName(){ 
        return name;
    }

    public int getmaxHp(){
        return maxHp;
    }

    public int gethp() {
        return hp;
    }

    public int getMaxMp(){
        return maxMp;
    }

    public int getMp(){
        return mp;
    }

    public int getexp() {
        return exp;
    }

    public int getlvl() {
        return level;
    }
    public int getDmg(){
        return myDmg;
    }

    
    public void expgain(int expIncome) {
        exp = exp + expIncome;
        lvlup();
    }

    public void dmgToHp(int dmg) {
        hp = hp - dmg;
        if(hp < 0){
            hp = 0;
        }
    }

    public void lvlup() {
        while (exp >= level * 10) {
            exp = exp - (level * 10);
            level++;
            maxHp = maxHp + 20;
            maxMp = maxMp +10;
            hp = maxHp;
            mp = maxMp;
            myDmg += 5;
            System.out.println("Level Up!!!!!");
        }
    }
    
    public boolean isPlayerDie(){
        if(hp == 0){
            return true;
        }
        return false;
    }

    public String getPic(){
        return playerPic;
    }
    public void usePotion(Item p){
        hp += p.getForHp();
        mp += p.getForMp();
        if(hp > maxHp){
            hp = maxHp;
        }
        if(mp > maxMp){
            mp = maxMp;
        }
    }

    public void useMp(int used){
        mp -= used;
    }
    public void resurrection(){
        hp = maxHp / 2;
        mp = maxMp / 2;
    }
}
