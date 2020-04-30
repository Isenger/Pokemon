public class Kaiju extends Monster {

    public Kaiju() {
        super("Kaiju");
        maxHp = 1000;
        hp = maxHp;
        exp = 500;
        level = 100;
        dmg = 10;
        dropRate = 80;
        itemDrop = new Potion();
        pic = "Kaiju.jpg";
    }
    
}