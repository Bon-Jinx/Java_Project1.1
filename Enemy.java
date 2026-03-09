class Enemy extends Character {

    public Enemy(String name, int health) {
        super(name, health);
    }
}

class EnemyAI {

    public void takeTurn(Enemy enemy, Player player) {

        Attack attack = new Attack();
        attack.execute(enemy, player);
    }
}
