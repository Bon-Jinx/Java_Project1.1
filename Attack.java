class Attack {

    public void execute(Character attacker, Character target) {

        int damage = DamageCalculator.calculateDamage();
        target.health -= damage;

        System.out.println(attacker.name + " dealt " + damage + " damage!");
    }
}