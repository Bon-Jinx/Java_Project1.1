public class Armor extends Item {

    int defenseBonus;

    public Armor(String name, int defenseBonus) {
        super(name, "Armor");
        this.defenseBonus = defenseBonus;
    }

    public void equip(Player player) {
        player.defense += defenseBonus;
        System.out.println("Equipped " + name);
    }
}