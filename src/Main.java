public class Main {
    public static void main(String[] args) {
        Boss alucard = new Boss();
        alucard.setDamage(30);
        alucard.setHeal(46);
        alucard.setTypeOfProtection("Fire shield");
        System.out.println("Alucard damage:" + alucard.getDamage() + " Alucard heal:" + alucard.getHeal() + " Alucard defence:" + alucard.getTypeOfProtection());
        Hero[] hero = createHero();
        for (int i = 0; i < createHero().length; i++) {
            System.out.println("Health: " + hero[i].getHeal());
            System.out.println("Damage: " + hero[i].getDamage());
            System.out.println("Super Power: " + hero[i].getSuperAbility());
        }
    }
    public static Hero[] createHero(){
        Hero Priest = new Hero(53,25);
        Hero Alchemist = new Hero(67,38,"INVISIBLE");
        Hero Medic = new Hero(42,0,"Healing");
        Hero [] heroes = {Priest,Alchemist,Medic};
        return heroes;
    }
}