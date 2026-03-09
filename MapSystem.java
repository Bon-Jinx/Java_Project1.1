import java.util.Random;

public class MapSystem {

    Random rand = new Random();

    public Enemy move(String direction) {

        System.out.println("You move " + direction + "...");

        int encounterChance = rand.nextInt(100);

        if (encounterChance < 40) {
            System.out.println("An enemy appears!");
            return EnemyFactory.createGoblin();
        }

        System.out.println("The area is quiet.");
        return null;
    }
}