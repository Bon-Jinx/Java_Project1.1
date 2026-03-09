public class Potion extends Item {

    int healAmount;

    public Potion(String name, int healAmount) {
        super(name, "Potion");
        this.healAmount = healAmount;
    }

    @Override
    public void use(Player player) {
        player.health += healAmount;
        System.out.println("Healed " + healAmount + " HP!");
    }
}