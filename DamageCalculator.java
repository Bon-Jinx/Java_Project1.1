class DamageCalculator {

    public static int calculateDamage() {

        Random rand = new Random();
        return rand.nextInt(10) + 5;
    }
}