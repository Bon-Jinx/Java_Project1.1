import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        Player p = new Player("Hero", 50);
        Monster m = new Monster("Slime", 30);
        Scanner sc = new Scanner(System.in);

        while(p.isAlive() && m.isAlive()){
            System.out.println(p.getStatus());
            System.out.println(m.getStatus());
            System.out.println("1) Attack 2) Heal");
            int choice = sc.nextInt();
            if(choice == 1){
                int dmg = p.attack();
                m.takeDamage(dmg);
                System.out.println("You deal " + dmg + " damage!");
            } else {
                p.heal(Dice.roll(5,10));
                System.out.println("You heal yourself!");
            }

            if(m.isAlive()){
                int dmg = m.attack();
                p.takeDamage(dmg);
                System.out.println(m.name + " attacks for " + dmg + " damage!");
            }
        }

        if(p.isAlive()) System.out.println("You win!");
        else System.out.println("You lose!");
        sc.close();
    }
}