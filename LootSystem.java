import java.util.Random;

public class LootSystem {

    Random rand = new Random();

    public Item dropLoot() {

        int roll = rand.nextInt(3);

        if (roll == 0) {
            return new Potion("Healing Potion", 25);
        }

        if (roll == 1) {
            return new Weapon("Iron Sword", 5);
        }

        return new Armor("Leather Armor", 3);
    }
}