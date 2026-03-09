import java.util.Scanner;

public class BattleSystem {

    Scanner sc = new Scanner(System.in);

    public void startBattle(Player player, Enemy enemy) {

        System.out.println("A wild " + enemy.name + " appeared!");

        while (player.isAlive() && enemy.isAlive()) {

            System.out.println("\n1. Attack");
            System.out.println("2. Use Potion");

            int choice = sc.nextInt();

            if (choice == 1) {
                player.attack(enemy);
            }

            if (choice == 2) {
                player.inventory.usePotion(player);
            }

            if (enemy.isAlive()) {
                enemy.attack(player);
            }

            System.out.println("Player HP: " + player.health);
            System.out.println(enemy.name + " HP: " + enemy.health);
        }

        if (player.isAlive()) {
            System.out.println("You defeated the enemy!");
        } else {
            System.out.println("You died...");
        }
    }
}
