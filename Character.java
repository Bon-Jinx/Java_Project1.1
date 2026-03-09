class Character {

    protected String name;
    protected int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public boolean isAlive() {
        return health > 0;
    }
}
