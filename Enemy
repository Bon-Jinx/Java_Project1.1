public class Enemy {

    String name;
    int health;
    int attack;
    int defense;

    public Enemy(String name, int health, int attack, int defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    public void attack(Player player) {
        int damage = attack - player.defense;
        if (damage < 0) damage = 0;

        player.takeDamage(damage);
        System.out.println(name + " dealt " + damage + " damage!");
    }

    public void takeDamage(int dmg) {
        health -= dmg;
    }

    public boolean isAlive() {
        return health > 0;
    }
}
