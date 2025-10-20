package entities;

public class Champion {

    private final String name;
    private final int attack;
    private final int armor;
    private int life;

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getAttack() {
        return attack;
    }

    public int getArmor() {
        return armor;
    }

    public void takeDamage(Champion other) {
        int damage = other.getAttack() - this.armor;
        if (damage < 1) {
            damage = 1;
        }
        this.life -= damage;
        if (this.life < 0) {
            this.life = 0;
        }
    }

    public String status() {
        if (life == 0) {
            return String.format(
                    "%s: %d de vida (morreu)",
                    name,
                    life
            );
        } else {
            return String.format(
                    "%s: %d de vida",
                    name,
                    life
            );
        }

    }
}
