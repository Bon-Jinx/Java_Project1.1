public class Game {

    public static void main(String[] args) {
        GameEngine engine = new GameEngine();
        engine.startGame();
    }
}

class GameEngine {

    Player player;
    Enemy enemy;
    BattleSystem battle;

    public void startGame() {

        player = new Player("Hero", 100);
        enemy = new Goblin();

        battle = new BattleSystem();
        battle.startBattle(player, enemy);
    }
}