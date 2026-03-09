public class Weapon extends Item {

    int attackBonus;

    public Weapon(String name, int attackBonus) {
        super(name, "Weapon");
        this.attackBonus = attackBonus;
    }

    public void equip(Player player) {
        player.attack += attackBonus;
        System.out.println("Equipped " + name);
    }
}