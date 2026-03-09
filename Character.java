public class Character {
    protected String name;
    protected int hp;
    protected int maxHp;

    public Character(String name, int maxHp){
        this.name = name;
        this.maxHp = maxHp;
        this.hp = maxHp;
    }

    public boolean isAlive(){ return hp > 0; }

    public void takeDamage(int dmg){
        hp -= dmg;
        if(hp < 0) hp = 0;
    }

    public void heal(int amount){
        hp += amount;
        if(hp > maxHp) hp = maxHp;
    }

    public String getStatus(){
        return name + " HP: " + hp + "/" + maxHp;
    }
}