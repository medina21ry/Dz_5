public class Hero {
    private int Heal;
    private int Damage;
    private String superAbility;

    public Hero(int heal, int damage, String superAbility) {
       this.Heal = heal;
        this.Damage = damage;
        this.superAbility = superAbility;
    }

    public Hero(int heal,int damage) {
        this.Heal = heal;
        this.Damage = damage;
    }

    public int getDamage() {
        return Damage;
    }

    public int getHeal() {
        return Heal;
    }

    public String getSuperAbility() {
        return superAbility;
    }
}
